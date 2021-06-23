package apply_design_pattern;

public class Decaf extends Beverage {

	public Decaf() {
		description = "Decaf";
	}

	@Override
	public long cost() {
		return 4;
	}

}
