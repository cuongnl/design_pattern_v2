package factory_exemple_1;

public class WoodFactory extends FutnitureAbstractFactory {

	@Override
	public Chair createChair() {
		return new WoodChair();
	}

	@Override
	public Table createTable() {
		return new WoodTable();
	}

}
