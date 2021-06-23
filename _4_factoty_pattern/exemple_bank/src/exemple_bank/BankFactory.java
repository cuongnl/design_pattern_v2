package exemple_bank;

public class BankFactory {

	public static final IBank getBank(BankType bankType) {
		switch (bankType) {
		case TP_BANK:
			return new TpBank();

		case MB_BANK:
			return new MbBank();
		default:
			return null;
		}
	}
}
