package before_use_abstract_method;

public class Client {
	public static void main(String[] args) {
		MbBank mbBank = new MbBank();
		System.out.println(mbBank.getName());
	}
}
