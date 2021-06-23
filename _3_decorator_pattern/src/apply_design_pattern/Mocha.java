package apply_design_pattern;

public class Mocha extends ComponentDecorator {

	Beverage beverage;

	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", mocha";
	}

	@Override
	public long cost() {
		return 11 + beverage.cost();
	}

}
