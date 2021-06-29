package concreteBuilder;

import builder.OrderBuilder;
import order.Order;
import type.BreadType;
import type.OrderType;
import type.SauceType;
import type.VegeTableType;

public class FastFoodOrderBuilder implements OrderBuilder {
	private OrderType orderType;
	private BreadType breadType;
	private SauceType sauceType;
	private VegeTableType vegetableType;

	@Override
	public OrderBuilder orderType(OrderType orderType) {
		this.orderType = orderType;
		return this;
	}

	@Override
	public OrderBuilder orderBread(BreadType breadType) {
		this.breadType = breadType;
		return this;
	}

	@Override
	public OrderBuilder orderSauce(SauceType sauceType) {
		this.sauceType = sauceType;
		return this;
	}

	@Override
	public OrderBuilder orderVegetable(VegeTableType vegetableType) {
		this.vegetableType = vegetableType;
		return this;
	}

	@Override
	public Order build() {
		return new Order(orderType, breadType, sauceType, vegetableType);
	}
}
