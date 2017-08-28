package item2;

/**
 * Replace Data Value with Object
 * 1. Create a customer class, add a final String field to put customer
 * 2. Replace the data value with customer class
 *
 */
public class OrderFinal {

    private Customer customer;

    public OrderFinal(String customerName) {
        this.customer = new Customer(customerName);
    }
    public String getCustomerName() {
        return customer.getName();
    }
    public void setCustomerName(String customerName) {
        customer = new Customer(customerName);
    }
}

