package extend_v2;

public class Espresso extends Beverage {
	public int cost() {
		System.out.println(getDescription() + " : " + (25 + super.cost()));
		return 0;
	}
}
