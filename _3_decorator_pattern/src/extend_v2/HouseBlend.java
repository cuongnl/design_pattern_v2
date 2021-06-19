package extend_v2;

public class HouseBlend extends Beverage {
	public int cost() {
		System.out.println(getDescription() + " : " + (30 + super.cost()));
		return 0;
	}
}
