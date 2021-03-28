package exemple_bank;

public class Client {
	public static void main(String[] args) {
		IBank bank = BankFactory.getBank(BankType.MB_BANK);
		System.out.println(bank.getBankInformation());
	}
}
