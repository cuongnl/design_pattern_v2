package apply_design_pattern;

public abstract class Beverage {

	protected String description = "Unknown Beverage";

	public String getDescription() {
		return description;
	}

	public abstract long cost();

}
