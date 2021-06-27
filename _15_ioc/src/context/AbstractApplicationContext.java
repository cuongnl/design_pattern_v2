package context;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.github.houbb.heaven.support.handler.IHandler;
import com.github.houbb.heaven.util.util.MapUtil;

import constant.ScopeConst;
import constant.enums.BeanSourceTypeEnum;
import constant.enums.ScopeEnum;
import core.Utils;
import core.impl.DefaultListableBeanFactory;
import exception.IocRuntimeException;
import model.AnnotationBeanDefinition;
import model.BeanDefinition;
import model.PropertyArgDefinition;
import model.impl.DefaultAnnotationBeanDefinition;
import support.envrionment.Environment;
import support.envrionment.impl.DefaultEnvironment;
import support.processor.ApplicationContextPostProcessor;

public abstract class AbstractApplicationContext extends DefaultListableBeanFactory implements ApplicationContext {

	private Map<String, BeanDefinition> beanDefinitionMap = new HashMap<>();

	private List<BeanDefinition> childBeanDefinitionList = new ArrayList<>();

	private List<BeanDefinition> abstractDefinitionList = new ArrayList<>();

	private List<BeanDefinition> createAbleDefinitionList = new ArrayList<>();

	private AnnotationBeanDefinition environmentBeanDefinition = buildEnvironmentBeanDefinition();

	@Override
	public String getApplicationName() {
		return "application context";
	}

	protected abstract List<BeanDefinition> buildBeanDefinitionList();

	protected void init() {
		List<BeanDefinition> beanDefinitionList = buildBeanDefinitionList();

		beanDefinitionList.add(environmentBeanDefinition);

		this.buildCreateAbleBeanDefinitionList(beanDefinitionList);

		createAbleDefinitionList = this.postProcessor(createAbleDefinitionList);

		super.dependsCheckService.registerBeanDefinitions(createAbleDefinitionList);

		this.registerBeanDefinitions(createAbleDefinitionList);

		this.registerShutdownHook();

		awareService.notifyAllApplicationContextAware(this);
	}

	@Override
	public Environment getEnvironment() {
		return DefaultEnvironment.defaultInstance();
	}

	private AnnotationBeanDefinition buildEnvironmentBeanDefinition() {
		final Class clazz = DefaultEnvironment.class;
		AnnotationBeanDefinition beanDefinition = new DefaultAnnotationBeanDefinition();
		beanDefinition.setName("environment");
		beanDefinition.setClassName(clazz.getName());
		beanDefinition.setLazyInit(false);
		beanDefinition.setScope(ScopeConst.SINGLETON);
		beanDefinition.setBeanSourceType(BeanSourceTypeEnum.SUPPORT);
		return beanDefinition;
	}

	private void registerBeanDefinitions(final List<BeanDefinition> beanDefinitionList) {
		if (!Utils.isEmpty(beanDefinitionList)) {
			for (BeanDefinition beanDefinition : beanDefinitionList) {
				this.fillDefaultValue(beanDefinition);

				super.registerBeanDefinition(beanDefinition.getName(), beanDefinition);
			}

			beanLifecycleService.registerSingletonBean(environmentBeanDefinition, getEnvironment());

			for (BeanDefinition beanDefinition : beanDefinitionList) {
				beanLifecycleService.createEagerSingleton(beanDefinition);
			}
		}
	}

	private void fillDefaultValue(BeanDefinition beanDefinition) {
		String scope = beanDefinition.getScope();
		if (Utils.isEmpty(scope)) {
			beanDefinition.setScope(ScopeEnum.SINGLETON.getCode());
		}
	}

	void buildCreateAbleBeanDefinitionList(final List<BeanDefinition> beanDefinitionList) {
		for (BeanDefinition beanDefinition : beanDefinitionList) {
			final String name = beanDefinition.getName();
			final String parentName = beanDefinition.getParentName();

			beanDefinitionMap.put(name, beanDefinition);

			if (beanDefinition.isAbstractClass()) {
				abstractDefinitionList.add(beanDefinition);
			} else if (!Utils.isEmpty(parentName)) {
				childBeanDefinitionList.add(beanDefinition);
			} else {
				createAbleDefinitionList.add(beanDefinition);
			}
		}

		this.addAllChildBeanDefinition();
	}

	private void addAllChildBeanDefinition() {
		for (BeanDefinition child : childBeanDefinitionList) {
			final String name = child.getName();
			final String parentName = child.getParentName();
			if (Utils.isEmpty(name)) {
				throw new IocRuntimeException("name can not be empty!");
			}
			if (name.equals(parentName)) {
				throw new IocRuntimeException(name + " parent bean is ref to itself!");
			}

			BeanDefinition parentDefinition = beanDefinitionMap.get(parentName);
			if (parentDefinition == null) {
				throw new IocRuntimeException(parentName + " not found !");
			}

			BeanDefinition newChild = buildChildBeanDefinition(child, parentDefinition);
			newChild.setName(name);

			createAbleDefinitionList.add(newChild);
		}
	}

	private BeanDefinition buildChildBeanDefinition(final BeanDefinition child, final BeanDefinition parent) {
		List<PropertyArgDefinition> childList = ArrayList(child.getPropertyArgList());

		Map<String, PropertyArgDefinition> childArgsMap = MapUtil.toMap(child.getPropertyArgList(),
				new IHandler<PropertyArgDefinition, String>() {
					@Override
					public String handle(PropertyArgDefinition propertyArgDefinition) {
						return propertyArgDefinition.getName();
					}
				});

		List<PropertyArgDefinition> parentArgs = parent.getPropertyArgList();
		if (!Utils.isEmpty(parentArgs)) {
			for (PropertyArgDefinition parentArg : parentArgs) {
				String name = parentArg.getName();
				if (childArgsMap.containsKey(name)) {
					continue;
				}

				childList.add(parentArg);
			}
		}

		child.setPropertyArgList(childList);
		return child;
	}

	private List<BeanDefinition> postProcessor(List<BeanDefinition> beanDefinitions) {
		List<ApplicationContextPostProcessor> postProcessors = super.getBeans(ApplicationContextPostProcessor.class);

		for (ApplicationContextPostProcessor processor : postProcessors) {
			beanDefinitions = processor.beforeRegister(beanDefinitions);
		}
		return beanDefinitions;
	}

	protected void registerShutdownHook() {
		Runtime.getRuntime().addShutdownHook(new Thread() {
			@Override
			public void run() {
				AbstractApplicationContext.this.destroy();
			}
		});
	}

	@Override
	public void destroy() {
		beanLifecycleService.destroy();
	}

}
