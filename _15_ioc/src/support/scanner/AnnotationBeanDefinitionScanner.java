package support.scanner;

import java.util.Set;

import model.AnnotationBeanDefinition;
import model.BeanDefinition;

/**
 * <p> project: ioc-BeanDefinitionScanner </p>
 * <p> create on 2019/11/18 20:38 </p>
 *
 * @author Administrator
 * @since 0.1.11
 * @see annotation.ComponentScan 包扫描
 * @see annotation.Component 组件注解
 */
public interface AnnotationBeanDefinitionScanner {

    /**
     * 扫描指定的包，返回对应的 {@link AnnotationBeanDefinition} 信息集合
     * @param context 上下文
     * @return 结果列表
     * @since 0.1.11
     */
    Set<AnnotationBeanDefinition> scan(final BeanDefinitionScannerContext context);

}
