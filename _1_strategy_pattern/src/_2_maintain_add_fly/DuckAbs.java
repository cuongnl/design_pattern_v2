package _2_maintain_add_fly;

public abstract class DuckAbs {
	public void quack(){
		System.out.println("duck is quack");
	}
	
	public void swim(){
		System.out.println("duck is swim");
	}
	
	public abstract void display();
	
	public void fly() {
		System.out.println("duck is fly");
	}
}
