package exemple_bank_2;

public class TpBank implements IBank {

	public TpBank() {
		this.id = 1;
		this.name = "TP BANK --";
	}

	private int id;
	private String name;

	@Override
	public IBank getBank() {
		return this;
	}

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
