package _17_abstract_factory_pattern;

public class FurnitureFactory {
	public FurnitureFactory() {
	}
	
	public static FurnitureAbstractFactory getFactory(Type materialType) {
        switch (materialType) {
        case FLASTIC:
            return new FlasticFactory();
        case WOOD:
            return new WoodFactory();
        default:
            throw new UnsupportedOperationException("This furniture is unsupported ");
        }
    }
}
