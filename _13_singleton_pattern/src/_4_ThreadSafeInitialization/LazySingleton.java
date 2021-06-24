package _4_ThreadSafeInitialization;

public class LazySingleton {
	private static LazySingleton INSTANCE;

	private LazySingleton() {
	}

	public static synchronized LazySingleton getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new LazySingleton();
		}

		return INSTANCE;
	}
}
