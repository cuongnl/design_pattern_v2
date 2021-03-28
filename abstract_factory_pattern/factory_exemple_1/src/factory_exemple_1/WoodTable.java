package factory_exemple_1;

public class WoodTable implements Table {

	@Override
	public void create() {
		System.out.println("Create wood table");
	}

}
