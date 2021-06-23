package apply_design_pattern;

public class Whip extends ComponentDecorator {

	Beverage beverage;

	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage + ", whip";
	}

	@Override
	public long cost() {
		return 14 + beverage.cost();
	}

}
