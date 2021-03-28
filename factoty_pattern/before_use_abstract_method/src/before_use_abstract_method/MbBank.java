package before_use_abstract_method;

public class MbBank {

	public MbBank() {
		this.id = 2;
		this.name = "MB BANK";
	}

	private int id;
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
