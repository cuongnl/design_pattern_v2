package _2_pack_object_init;

public class OrderPizza {

	SimplePizzaFactory simplePizzaFactory;
	public OrderPizza(SimplePizzaFactory simplePizzaFactory) {
		this.simplePizzaFactory = simplePizzaFactory;
	}
	public Pizza order(String type) {
		Pizza pizza = simplePizzaFactory.createPizza(type);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
}
