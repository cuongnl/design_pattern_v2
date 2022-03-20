package _1_start_pizza;

public class ClamPizza implements Pizza {
	@Override
	public void prepare() {
		System.out.println("prepare Clam");
		
	}

	@Override
	public void bake() {		
		System.out.println("bake Clam");
	}

	@Override
	public void cut() {
		System.out.println("cut Clam");
	}

	@Override
	public void box() {
		System.out.println("box Clam");		
	}
}
