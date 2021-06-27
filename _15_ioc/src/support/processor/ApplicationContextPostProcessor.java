package support.processor;

import java.util.List;

import model.BeanDefinition;

/**
 * 用来标识可以修改的接口类
 * <p> project: ioc-Processor </p>
 * <p> create on 2019/11/12 23:58 </p>
 *
 * @author Administrator
 * @since 0.0.8
 */
public interface ApplicationContextPostProcessor extends PostProcessor {

    /**
     * 对象属性注册之前
     * @param definitionList 对象原始定义信息列表
     * @return 结果
     * @since 0.0.8
     */
    List<BeanDefinition> beforeRegister(List<BeanDefinition> definitionList);

}
