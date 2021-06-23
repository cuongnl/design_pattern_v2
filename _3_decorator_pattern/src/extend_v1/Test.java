package extend_v1;

public class Test {
	public static void main(String[] args) {
		Beverage drakRoast = new DarkRoast();
		drakRoast.setDescription("drakRoast");
		drakRoast.cost();
		
		Beverage drakRoastMilk = new DarkRoastMilk();
		drakRoastMilk.setDescription("drakRoastMilk");
		drakRoastMilk.cost();
		
		Beverage drakRoastMilkMatcha = new DarkRoastMilkMatcha();
		drakRoastMilkMatcha.setDescription("drakRoastMilkMatcha");
		drakRoastMilkMatcha.cost();
		
		Beverage espresso = new Espresso();
		espresso.setDescription("espresso");
		espresso.cost();
	
	}
}
