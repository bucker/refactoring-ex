package item8;

import java.util.HashSet;
import java.util.Set;

public class Customer {
    void addOrder(Order arg) {
        arg.setCustomer(this);
    }

    private Set<Order> _orders = new HashSet<>();

    Set<Order> friendOrders() {
        /** should only be used by Order */
        return _orders;
    }

    double getPriceFor(Order order) {
        return order.getDiscountedPrice();
    }

    public double getDiscount() {
        return 0.05;
    }
}
