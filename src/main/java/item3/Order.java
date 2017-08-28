package item3;

/**
 * Change Value to Reference
 * -> Replace equal instances into single instance
 * 1. Replace Constructor with Factory Method: Customer.create()
 * 2. Change `new Customer` to `Customer.create`
 * 3. Load customer from start-up: `static Dictionary instances`
 * 4. Modify factory method, return pre-loaded customer object
 */
public class Order {
    // May exist many objects which present the same customer
    private Customer customer;

    public Order(String customerName) {
        customer = new Customer(customerName);
    }

    public void setCustomer(String customerName) {
        customer = new Customer(customerName);
    }

    public String getCustomerName() {
        return customer.getName();
    }
}

