package start;

public class Test {
	public static void main(String[] args) {
		Beverage drakRoast = new DarkRoast();
		drakRoast.setDescription("drakRoast");
		drakRoast.cost();
		
		Beverage espresso = new Espresso();
		espresso.setDescription("espresso");
		espresso.cost();
	
	}
}
