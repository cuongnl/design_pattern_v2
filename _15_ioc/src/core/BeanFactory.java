package core;

/**
 * bean 工厂接口
 * @author binbin.hou
 * @since 0.0.1
 */
public interface BeanFactory {

    /**
     * 根据名称获取对应的实例信息
     * （1）属性不存在，抛出不存在异常 {@link exception.IocRuntimeException}
     * （2）存在多个对象实现，直接抛出异常  {@link exception.IocRuntimeException}
     * @param beanName bean 名称
     * @return 对象信息
     * @since 0.0.1
     */
    Object getBean(final String beanName);

    /**
     * 获取指定类型的实现
     * @param beanName 属性名称
     * @param requiredType 类型
     * @param <T> 泛型
     * @return 结果
     * @since 0.0.1
     */
    <T> T getBean(final String beanName, final Class<T> requiredType);

    /**
     * 是否包含指定的 bean
     * @param beanName bean 名称
     * @return 是否包含
     * @since 0.0.2
     */
    boolean containsBean(final String beanName);

    /**
     * 指定的 bean 和需要的类型二者是否匹配。
     * @param beanName bean 名称
     * @param requiredType 需要的类型
     * @return 是否包含
     * @since 0.0.2
     */
    boolean isTypeMatch(final String beanName, final Class requiredType);

    /**
     * 获取 bean 对应的类型
     * @param beanName bean 名称
     * @return 类型信息
     * @since 0.0.2
     * @see #getBean(String) 对应的类型
     */
    Class<?> getType(final String beanName);

}
