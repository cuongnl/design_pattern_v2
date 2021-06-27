package support.condition;

import com.github.houbb.heaven.reflect.meta.annotation.IAnnotationTypeMeta;

import core.BeanFactory;
import support.envrionment.Environment;
import support.envrionment.EnvironmentCapable;
import support.lifecycle.registry.BeanDefinitionRegistry;

/**
 * 条件上下文执行接口
 * @author binbin.hou
 * @since 0.1.8
 */
public interface ConditionContext extends EnvironmentCapable {

    /**
     * 获取对象工厂信息
     * @return 工厂信息
     * @since 0.1.8
     */
    BeanFactory getBeanFactory();

    /**
     * 获取对象信息注册类
     * @return 对象信息注册类
     * @since 0.1.8
     */
    BeanDefinitionRegistry getBeanDefinitionRegistry();

    /**
     * 获取注解相关元信息
     * @return 注解元信息
     * @since 0.1.8
     */
    IAnnotationTypeMeta getAnnotationTypeMeta();

}