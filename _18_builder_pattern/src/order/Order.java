package order;

import type.BreadType;
import type.OrderType;
import type.SauceType;
import type.VegeTableType;

public class Order {
	private OrderType orderType;
	private BreadType breadType;
	private SauceType sauceType;
	private VegeTableType vegetableType;

	public Order(OrderType orderType, BreadType breadType, SauceType sauceType, VegeTableType vegetableType) {
		super();
		this.orderType = orderType;
		this.breadType = breadType;
		this.sauceType = sauceType;
		this.vegetableType = vegetableType;
	}

	public OrderType getOrderType() {
		return orderType;
	}

	public BreadType getBreadType() {
		return breadType;
	}

	public SauceType getSauceType() {
		return sauceType;
	}

	public VegeTableType getVegetableType() {
		return vegetableType;
	}
	
	@Override
    public String toString() {
        return "Order [orderType=" + orderType + ", breadType=" + breadType + ", sauceType=" + sauceType
                + ", vegetableType=" + vegetableType + "]";
    }

}
