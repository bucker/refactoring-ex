package item7;

public class OrderFinal {
    CustomerFinal customer;

    CustomerFinal getCustomer() {
        return customer;
    }

    void setCustomer(CustomerFinal arg) {
        if (customer != null) {
            customer.friendOrders().remove(this);
        }

        customer = arg;
        if (customer != null) {
            customer.friendOrders().add(this);
        }
    }
}
