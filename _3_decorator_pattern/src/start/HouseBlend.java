package start;

public class HouseBlend extends Beverage {

	@Override
	protected void cost() {
		System.out.println(getDescription()+" : 25 vnd");
	}

}
