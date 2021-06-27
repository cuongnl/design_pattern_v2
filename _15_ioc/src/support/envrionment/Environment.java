package support.envrionment;

/**
 * <p> project: ioc-Environment </p>
 * <p> create on 2019/11/30 14:37 </p>
 *
 * @author Administrator
 * @since 0.1.9
 * @see annotation.Profile 环境标识注解
 */
public interface Environment {

    /**
     * 获取激活的环境信息
     * @return 环境信息
     * @since 0.1.9
     */
    String[] getActiveProfiles();

}
