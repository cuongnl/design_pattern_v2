package support.condition.impl;

import java.util.Map;

import support.condition.Condition;
import support.condition.ConditionContext;

/**
 * 环境上下文
 *
 * （1）这里一样的只需要关心自己就行了。
 * （2）只要标识的环境和激活的环境有一个匹配，则认为匹配。
 *
 * @author binbin.hou
 * @since 0.1.9
 * @see annotation.Profile 环境标识
 */
public class ProfileCondition implements Condition {

    @Override
    public boolean matches(ConditionContext context, Map<String, Object> attributes) {
        String[] activeProfiles = context.getEnvironment().getActiveProfiles();
        String[] currentProfiles = (String[]) attributes.get("value");

        for(String activeProfile : activeProfiles) {
            for(String profile : currentProfiles) {
                if(activeProfile.equalsIgnoreCase(profile)) {
                    return true;
                }
            }
        }

        return false;
    }

}