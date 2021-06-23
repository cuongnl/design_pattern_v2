package extend_v1;

public class DarkRoastMilkMatcha extends Beverage {
	
	@Override
	protected void cost() {
		System.out.println(getDescription()+" : 17 vnd");
	}

}
