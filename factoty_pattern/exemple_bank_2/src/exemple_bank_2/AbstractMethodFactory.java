package exemple_bank_2;

public class AbstractMethodFactory {
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
