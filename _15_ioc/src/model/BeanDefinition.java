package model;

import java.util.List;

import constant.enums.BeanSourceTypeEnum;

public interface BeanDefinition {

    String getName();

    void setName(final String name);

    String getClassName();

    void setClassName(final String className);

    String getScope();

    void setScope(final String scope);

    boolean isLazyInit();

    void setLazyInit(final boolean isLazyInit);

    void setInitialize(final String initialize);

    String getInitialize();

    void setDestroy(final String destroy);

    String getDestroy();

    void setFactoryMethod(final String factoryMethod);

    String getFactoryMethod();

    List<ConstructorArgDefinition> getConstructorArgList();

    void setConstructorArgList(final List<ConstructorArgDefinition> constructorArgList);

    List<PropertyArgDefinition> getPropertyArgList();

    void setPropertyArgList(final List<PropertyArgDefinition> propertyArgList);

    boolean isAbstractClass();

    void setAbstractClass(boolean abstractClass);

    String getParentName();

    void setParentName(String parentName);

    void setBeanSourceType(final BeanSourceTypeEnum beanSourceType);

    BeanSourceTypeEnum getBeanSourceType();

}
