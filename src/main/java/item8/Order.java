package item8;

/**
 * Change Bidirectional Association to Unidirectional
 * aka: two-way link -> one-way link
 * -> Remove the link from Order to Customer
 * 1. Check all methods that use the `customer`
 * 2. Remove customer
 */
public class Order {
    // There exist no Order if the customer doesn't exist
    // we want to remove this field
    private Customer customer;

    Customer getCustomer() {
        return customer;
    }

    void setCustomer(Customer arg) {
        if (customer != null) {
            customer.friendOrders().remove(this);
        }
        customer = arg;
        if (customer != null) {
            customer.friendOrders().add(this);
        }
    }

    // 1. Pass the customer
    double getDiscountedPrice() {
        return getGrossPrice() * (1 - customer.getDiscount());
    }

    public double getGrossPrice() {
        return 3.14;
    }
}
