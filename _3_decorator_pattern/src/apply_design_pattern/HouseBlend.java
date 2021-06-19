package apply_design_pattern;

public class HouseBlend extends Beverage{

	public HouseBlend() {
		description = "HouseBlend";
	}
	
	@Override
	public long cost() {
		return 1;
	}

}
