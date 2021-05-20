package source;

public class Test {
	public static void main(String[] args) {
		Duck mallialDuck = new MallardDuck();
		mallialDuck.handleFlyable();
		mallialDuck.handleQuackable();
		mallialDuck.display();
	}
}
