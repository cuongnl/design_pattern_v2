package _16_factory_method_pattern;

public class Test {
	public static void main(String[] args) {
		Bank bank = BankFactory.getBank(BankType.TPBANK);
		System.out.println(bank.getBankName());
	}
}
