package _1_start_pizza;

public class GreekPizza implements Pizza {

	@Override
	public void prepare() {
		System.out.println("prepare Greek");
		
	}

	@Override
	public void bake() {		
		System.out.println("bake Greek");
	}

	@Override
	public void cut() {
		System.out.println("cut Greek");
	}

	@Override
	public void box() {
		System.out.println("box Greek");		
	}

}
