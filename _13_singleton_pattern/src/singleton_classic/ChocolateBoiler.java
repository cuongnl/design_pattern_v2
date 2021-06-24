package singleton_classic;

public class ChocolateBoiler {
	private boolean empty;
	private boolean boiled;
	
	private static ChocolateBoiler uniqueInstance;
	
	private ChocolateBoiler() {
		empty = true;
		boiled = true;
	}
	
	public static ChocolateBoiler getInstance() {
		if(uniqueInstance == null) {
			return uniqueInstance = new ChocolateBoiler();
		}
		return uniqueInstance;
	}
	
	public void fill() {
		if(empty) {
			System.out.println("empty : "+empty);
		}
	}
}
