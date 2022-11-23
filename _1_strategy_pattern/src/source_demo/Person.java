package source_demo;

public abstract class Person {

	// method HAS - A
	Customerable customerable;
	Introductionable introductionable;
	Orderable orderable;

	// function common
	public void orderBook() {
		System.out.println("orderBook");
	}

	public void orderBookDetail() {
		System.out.println("orderBookDetail");
	}

	public abstract void display();
	
	//handle method HAS-A
	public void handleCustomerAble() {
		customerable.customerView();
	}
	
	public void handleIntroductionAble() {
		introductionable.introduction();
	}
	
	public void handleOrderAble() {
		orderable.order();
	}
	
	
	
	//getter and setter 
	public Customerable getCustomerable() {
		return customerable;
	}

	public void setCustomerable(Customerable customerable) {
		this.customerable = customerable;
	}

	public Introductionable getIntroductionable() {
		return introductionable;
	}

	public void setIntroductionable(Introductionable introductionable) {
		this.introductionable = introductionable;
	}

	public Orderable getOrderable() {
		return orderable;
	}

	public void setOrderable(Orderable orderable) {
		this.orderable = orderable;
	}

}
