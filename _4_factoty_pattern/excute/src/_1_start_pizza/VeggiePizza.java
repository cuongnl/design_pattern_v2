package _1_start_pizza;

public class VeggiePizza implements Pizza {
	@Override
	public void prepare() {
		System.out.println("prepare Veggie");
		
	}

	@Override
	public void bake() {		
		System.out.println("bake Veggie");
	}

	@Override
	public void cut() {
		System.out.println("cut Veggie");
	}

	@Override
	public void box() {
		System.out.println("box Veggie");		
	}
}
