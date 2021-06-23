package apply_design_pattern;

public class Soy extends ComponentDecorator {

	Beverage beverage;

	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", soy";
	}

	@Override
	public long cost() {
		return 12 + beverage.cost();
	}

}
