package extend_v2;

public class Test {
	public static void main(String[] args) {
		Beverage drakRoast = new DarkRoast();
		drakRoast.setDescription("drakRoast");
		drakRoast.setMatcha(true);
		drakRoast.cost();
		
		Beverage espresso = new Espresso();
		espresso.setDescription("espresso");
		espresso.setMilk(true);
		espresso.cost();
	
	}
}
