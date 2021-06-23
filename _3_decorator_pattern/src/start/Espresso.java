package start;

public class Espresso extends Beverage {

	@Override
	protected void cost() {
		System.out.println(getDescription()+" : 20 vnd");
	}

}
