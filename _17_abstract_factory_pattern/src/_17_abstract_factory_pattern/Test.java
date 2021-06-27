package _17_abstract_factory_pattern;

public class Test {
	public static void main(String[] args) {
		 
        FurnitureAbstractFactory factory = FurnitureFactory.getFactory(Type.FLASTIC);
 
        Chair chair = factory.createChair();
        chair.create(); // Create plastic chair
 
        Table table = factory.createTable();
        table.create(); // Create plastic table
    }
}
