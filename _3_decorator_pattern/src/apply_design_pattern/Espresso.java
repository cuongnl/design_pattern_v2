package apply_design_pattern;


public class Espresso extends Beverage {
	
	public Espresso() {
		description = "Espresso";
	}
	
	@Override
	public long cost() {
		return 3;
	}

}
