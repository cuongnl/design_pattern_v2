package _1_eagerInitialization;

public class EageInitializationSingleton {
	private static final EageInitializationSingleton init = new EageInitializationSingleton();

	private EageInitializationSingleton() {
	}

	public static EageInitializationSingleton getInstance() {
		return init;
	}
}
