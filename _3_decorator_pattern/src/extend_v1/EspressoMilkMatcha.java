package extend_v1;

public class EspressoMilkMatcha extends Beverage {

	@Override
	protected void cost() {
		System.out.println(getDescription()+" : 31 vnd");
	}

}
