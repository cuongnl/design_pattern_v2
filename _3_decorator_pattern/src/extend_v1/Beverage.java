package extend_v1;

public abstract class Beverage {

	public String description;

	protected abstract void cost();

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
