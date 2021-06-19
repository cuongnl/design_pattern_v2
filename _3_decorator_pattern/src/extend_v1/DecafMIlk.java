package extend_v1;

public class DecafMIlk extends Beverage {

	@Override
	protected void cost() {
		System.out.println(getDescription()+" : 15 vnd");
	}

}
