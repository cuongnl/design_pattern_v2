package extend_v1;

public class DarkRoastMilk extends Beverage {
	
	@Override
	protected void cost() {
		System.out.println(getDescription()+" : 32 vnd");
	}

}
