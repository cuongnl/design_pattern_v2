package _1_start_pizza;

public class OrderPizza {

	public Pizza order(String type) {
		Pizza pizza = null;
		if (type.equals("cheese")) {
			pizza = new CheesePizza();
		} else if (type.equals("greek")) {
			pizza = new GreekPizza();
		} else if (type.equals("pepperoni")) {
			pizza = new PepperoniPizza();
		} else if (type.equals("clame")) {
		    pizza = new ClamPizza();
		} else if (type.equals("veggie")) {
		    pizza = new VeggiePizza();
		} 

		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
}
