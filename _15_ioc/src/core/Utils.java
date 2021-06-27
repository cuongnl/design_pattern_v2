package core;

import java.util.Collection;

public class Utils {

	public static boolean isEmpty(String str) {

		if (str == null) {
			return true;
		}
		if (str.length() == 0) {
			return true;
		}

		return false;
	}

	public static boolean isEmpty(Collection collection) {
		return null == collection || collection.isEmpty();
	}
}
