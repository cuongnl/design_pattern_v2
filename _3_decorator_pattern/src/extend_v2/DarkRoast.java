package extend_v2;

public class DarkRoast extends Beverage {
	public int cost() {
		System.out.println(getDescription() + " : " + (15 + super.cost()));
		return 0;
	}
}
