package support.lifecycle.property.impl;

import com.github.houbb.heaven.annotation.ThreadSafe;
import com.github.houbb.heaven.util.lang.reflect.ReflectMethodUtil;

import core.BeanFactory;
import model.PropertyArgDefinition;
import support.lifecycle.property.SingleBeanPropertyProcessor;

/**
 * 对象属性设置类。
 *
 * 主要分为两个部分：
 *
 * （1）直接根据属性值设置
 * （2）根据引用属性设置
 *
 * <p> project: ioc-BeanPropertyProcessor </p>
 * <p> create on 2019/11/8 20:53 </p>
 *
 * @author houbinbin
 * @since 0.0.7
 */
@ThreadSafe
class RefBeanPropertyProcessor implements SingleBeanPropertyProcessor {

    private static final RefBeanPropertyProcessor INSTANCE = new RefBeanPropertyProcessor();

    public static RefBeanPropertyProcessor getInstance() {
        return INSTANCE;
    }

    @Override
    public void propertyProcessor(BeanFactory beanFactory, Object instance,
                                  PropertyArgDefinition propertyArgDefinition) {
        final String refStr = propertyArgDefinition.getRef();

        Object ref = beanFactory.getBean(refStr);
        ReflectMethodUtil.invokeSetterMethod(instance, propertyArgDefinition.getName(), ref);
    }

}
