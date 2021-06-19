package extend_v1;

public class DarkRoast extends Beverage {
	
	@Override
	protected void cost() {
		System.out.println(getDescription()+" : 10 vnd");
	}

}
