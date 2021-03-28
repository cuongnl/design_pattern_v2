package factory_exemple_1;

public class Client {
	public static void main(String[] args) {
		FutnitureAbstractFactory factory = FurnitureFactory.getFactory(Type.WOOD);
		
		Chair chair = factory.createChair();
		chair.create();
		
		Table table = factory.createTable();
		table.create();
	}
}
