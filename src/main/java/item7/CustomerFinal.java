package item7;

import java.util.HashSet;
import java.util.Set;

public class CustomerFinal {
    private Set<OrderFinal> orders = new HashSet<>();

    Set<OrderFinal> friendOrders() {
        return orders;
    }
}
