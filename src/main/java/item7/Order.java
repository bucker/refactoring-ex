package item7;

/**
 * Change Unidirectional Association to Bidirectional
 * 1. Add Order set in Customer, add method to get order set
 * 2. Add order into customer when setCustomer()
 * 3. Aware the null check
 */
public class Order {
    private Customer customer;

    Customer getCustomer() {
        return customer;
    }

    void setCustomer(Customer arg) {
        customer = arg;
    }
}
