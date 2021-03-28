package factory_exemple_1;

public class FurnitureFactory {
	public static final FutnitureAbstractFactory getFactory(Type type) {
		switch (type) {
		case FLASTIC:
			return new PlasticFactory();
		case WOOD:
			return new WoodFactory();
		default:
			return null;
		}
	}
}
