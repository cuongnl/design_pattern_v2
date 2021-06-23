package extend_v1;

public class HouseBlendMilkMatcha extends Beverage {

	@Override
	protected void cost() {
		System.out.println(getDescription()+" : 36 vnd");
	}

}
