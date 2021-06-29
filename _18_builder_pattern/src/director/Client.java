package director;

import concreteBuilder.FastFoodOrderBuilder;
import order.Order;
import type.BreadType;
import type.OrderType;
import type.SauceType;

public class Client {
	public static void main(String[] args) {
		Order order = new FastFoodOrderBuilder().orderType(OrderType.ON_SITE).orderBread(BreadType.OMELETTE)
				.orderSauce(SauceType.SOY_SAUCE).build();
		System.out.println(order);
	}
}
