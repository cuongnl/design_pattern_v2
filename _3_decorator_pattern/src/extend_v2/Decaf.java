package extend_v2;

public class Decaf extends Beverage {
	public int cost() {
		System.out.println(getDescription() + " : " + (20 + super.cost()));
		return 0;
	}
}
