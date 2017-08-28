package item8;

import java.util.HashSet;
import java.util.Set;

public class CustomerFinal {
    private Set<OrderFinal> orders = new HashSet<>();

    Set<OrderFinal> friendOrders() {
        return orders;
    }

    double getPriceFor(OrderFinal order) {
        return order.getDiscountedPrice(this);
    }

    public double getDiscount() {
        return 0.05;
    }
}
