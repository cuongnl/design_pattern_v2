package _2_staticBlockInitialization;

public class StaticBlockInitializationSingleton {
	private static StaticBlockInitializationSingleton INSTANCE;

	private StaticBlockInitializationSingleton() {
	}

	static {
		try {
			INSTANCE = new StaticBlockInitializationSingleton();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static StaticBlockInitializationSingleton getInstance() {
		return INSTANCE;
	}
}
