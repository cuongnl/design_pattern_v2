package _16_factory_method_pattern;

public class BankFactory {
	public BankFactory() {
	}

	public static final Bank getBank(BankType bankType) {
		switch (bankType) {
		case TPBANK:
			return new TPbank();
		case MBBANK:
			return new MBbank();
		default:
			throw new IllegalArgumentException("This bank type is unsupported");
		}
	}
}
