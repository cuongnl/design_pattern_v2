package apply_design_pattern;

public class Milk extends ComponentDecorator {

	Beverage beverage;

	public Milk(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", milk";
	}

	@Override
	public long cost() {
		return 10 + beverage.cost();
	}
}
