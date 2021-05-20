package source;

public class RedheadDuck extends Duck {

	public RedheadDuck() {
		flyable = new FlyNoWay();
		quackable = new MuteQuack();
	}
	
	@Override
	public void display() {
		System.out.println("readhead duck");
		
	}

}
