package _17_abstract_factory_pattern;

public class WoodFactory extends FurnitureAbstractFactory {

	@Override
	public Chair createChair() {
		return new WoodChair();
	}

	@Override
	public Table createTable() {
		return new WoodTable();
	}

}
