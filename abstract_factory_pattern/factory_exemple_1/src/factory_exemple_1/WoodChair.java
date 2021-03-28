package factory_exemple_1;

public class WoodChair implements Chair {

	@Override
	public void create() {
		System.out.println("Create wood chair");
	}

}
