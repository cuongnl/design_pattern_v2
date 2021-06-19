package apply_design_pattern;

public class DarkRoast extends Beverage {

	public DarkRoast() {
		description = "DarkRoast";
	}

	@Override
	public long cost() {
		return 2;
	}

}
