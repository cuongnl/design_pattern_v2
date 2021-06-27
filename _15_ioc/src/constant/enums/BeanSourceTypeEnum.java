package constant.enums;

public enum BeanSourceTypeEnum {

	RESOURCE,

	CONFIGURATION,

	CONFIGURATION_BEAN,

	SUPPORT,

	COMPONENT;

	public static boolean isConfigurationBean(final BeanSourceTypeEnum sourceTypeEnum) {
		return CONFIGURATION_BEAN.equals(sourceTypeEnum);
	}

	public static boolean isConfiguration(final BeanSourceTypeEnum sourceTypeEnum) {
		return CONFIGURATION.equals(sourceTypeEnum);
	}

}
