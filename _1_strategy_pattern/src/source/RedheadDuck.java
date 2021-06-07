package source;

public class RedheadDuck extends Duck {

	//use constructor for runtime 
	public RedheadDuck() {
		flyable = new FlyNoWay();
		quackable = new Squeak();
	}
	
	@Override
	public void display() {
		System.out.println("readhead duck");
		
	}

}
