package factory_exemple_1;

public class PlasticChair implements Chair {

	@Override
	public void create() {
		System.out.println("create plastic chair");
	}

}
