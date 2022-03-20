package _2_pack_object_init;

public class PepperoniPizza implements Pizza {

	@Override
	public void prepare() {
		System.out.println("prepare Pepperoni");
		
	}

	@Override
	public void bake() {		
		System.out.println("bake Pepperoni");
	}

	@Override
	public void cut() {
		System.out.println("cut Pepperoni");
	}

	@Override
	public void box() {
		System.out.println("box Pepperoni");		
	}

}
