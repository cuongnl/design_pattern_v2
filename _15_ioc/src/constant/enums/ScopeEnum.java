package constant.enums;

import constant.ScopeConst;

public enum ScopeEnum {

	SINGLETON(ScopeConst.SINGLETON),

	PROTOTYPE(ScopeConst.PROTOTYPE),;

	private final String code;

	ScopeEnum(String code) {
		this.code = code;
	}

	public String getCode() {
		return code;
	}

}
