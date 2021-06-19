package extend_v2;

public abstract class Beverage {

	public String description;
	private boolean milk;
	private boolean matcha;

	protected int cost() {
		int cost = 0;
		if (milk) {
			cost += 7;
		}
		if (matcha) {
			cost += 4;
		}

		return cost;
	};

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isMilk() {
		return milk;
	}

	public void setMilk(boolean milk) {
		this.milk = milk;
	}

	public boolean isMatcha() {
		return matcha;
	}

	public void setMatcha(boolean matcha) {
		this.matcha = matcha;
	}

}
