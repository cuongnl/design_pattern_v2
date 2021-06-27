package annotation;

import java.lang.annotation.Annotation;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import support.name.BeanNameStrategy;
import support.name.impl.DefaultBeanNameStrategy;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.TYPE })
public @interface ComponentScan {

	String[] value();

	Class<? extends Annotation>[] excludes() default {};

	Class<? extends Annotation>[] includes() default { Component.class };

	Class<? extends BeanNameStrategy> beanNameStrategy() default DefaultBeanNameStrategy.class;

}
