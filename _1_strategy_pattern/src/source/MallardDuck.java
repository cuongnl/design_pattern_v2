package source;

public class MallardDuck extends Duck {

	public MallardDuck() {
		flyable = new FlyWithWing();
		quackable = new Quack();
	}
	
	@Override
	public void display() {
		System.out.println("mallard duck");
	}
}
