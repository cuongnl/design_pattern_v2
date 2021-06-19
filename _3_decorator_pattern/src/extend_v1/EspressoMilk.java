package extend_v1;

public class EspressoMilk extends Beverage {

	@Override
	protected void cost() {
		System.out.println(getDescription()+" : 27 vnd");
	}

}
