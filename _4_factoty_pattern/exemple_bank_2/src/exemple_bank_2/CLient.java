package exemple_bank_2;

public class CLient {
	public static void main(String[] args) {
		IBank bank = AbstractMethodFactory.getBank(BankType.TP_BANK);
		System.out.println(bank.getBank().getClass());
	}
}
