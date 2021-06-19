package extend_v1;

public class DecafMIlkMatcha extends Beverage {

	@Override
	protected void cost() {
		System.out.println(getDescription()+" : 15 vnd");
	}

}
