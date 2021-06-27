package support.aware.service.impl;

import context.ApplicationContext;
import core.BeanFactory;
import core.ListableBeanFactory;
import support.aware.ApplicationContextAware;
import support.aware.BeanNameAware;
import support.aware.service.AwareService;

import java.util.List;

/**
 * 默认实现
 * @author binbin.hou
 * @since 0.1.8
 */
public class DefaultAwareService implements AwareService {

    /**
     * 对象工厂
     * @since 0.1.8
     */
    private BeanFactory beanFactory;

    @Override
    public void setBeanFactory(BeanFactory beanFactory) {
        this.beanFactory = beanFactory;
    }

    @Override
    public void notifyAllBeanNameAware(String beanName) {
        if(this.beanFactory instanceof ListableBeanFactory) {
            ListableBeanFactory listableBeanFactory = (ListableBeanFactory)beanFactory;
            List<BeanNameAware> awareList = listableBeanFactory.getBeans(BeanNameAware.class);

            for (BeanNameAware aware : awareList) {
                aware.setBeanName(beanName);
            }
        }
    }

    @Override
    public void notifyAllApplicationContextAware(ApplicationContext applicationContext) {
        if(beanFactory instanceof ListableBeanFactory) {
            ListableBeanFactory listableBeanFactory = (ListableBeanFactory)beanFactory;
            List<ApplicationContextAware> awareList = listableBeanFactory.getBeans(ApplicationContextAware.class);

            for(ApplicationContextAware aware : awareList) {
                aware.setApplicationContext(applicationContext);
            }
        }
    }

}
