package source;

public class RubberDuck extends Duck {

	//use constructor for action runtime
	public RubberDuck() {
		flyable = new FlyNoWay();
		quackable = new MuteQuack();
	}

	@Override
	public void display() {
		System.out.println("");

	}

}
