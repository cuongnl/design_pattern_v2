package exemple_bank_2;

public class MbBank implements IBank {
	
	public MbBank() {
		this.id = 2;
		this.name = "MB BANK ----";
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
