package _17_abstract_factory_pattern;

public class FlasticFactory extends FurnitureAbstractFactory {

	@Override
	public Chair createChair() {
		return new FlasticChair();
	}

	@Override
	public Table createTable() {
		return new FlasticTable();
	}

}
