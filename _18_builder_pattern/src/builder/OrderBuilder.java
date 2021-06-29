package builder;

import order.Order;
import type.BreadType;
import type.OrderType;
import type.SauceType;
import type.VegeTableType;

public interface OrderBuilder {
	OrderBuilder orderType(OrderType orderType);
	 
    OrderBuilder orderBread(BreadType breadType);
 
    OrderBuilder orderSauce(SauceType sauceType);
 
    OrderBuilder orderVegetable(VegeTableType vegetableType);
 
    Order build();
}
