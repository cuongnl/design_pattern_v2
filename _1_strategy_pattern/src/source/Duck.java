package source;

public abstract class Duck {
	
	Flyable flyable;
	Quackable quackable;
	
	//add fly, but there are duck not quack --> not good
//	public void quack() {
//		System.out.println("quack quack");
//	}
	
	//all duck
	public void swim() {
		System.out.println("swimming");
	}
	
	//multiple duck --> unlike
	public abstract void display();
	
	//add fly, but there are duck not fly --> not good
//	public void fly() {
//		System.out.println("fly");
//	};
	
	//apply design pattern
	public void handleFlyable() {
		flyable.fly();
	}
	
	public void handleQuackable() {
		quackable.quack();
	}

	// handle change value
	public Flyable getFlyable() {
		return flyable;
	}

	public void setFlyable(Flyable flyable) {
		this.flyable = flyable;
	}

	public Quackable getQuackable() {
		return quackable;
	}

	public void setQuackable(Quackable quackable) {
		this.quackable = quackable;
	}
	
	
}
