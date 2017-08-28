package item2;

/**
 * Replace Data Value with Object
 * 1. Create a customer class, add a final String field to put customer
 * 2. Replace the type of customer from String to Customer class
 * 3. Rename method and parameter: customerName
 */
public class Order {

    private String customer;

    public Order (String customer) {
        this.customer = customer;
    }
    public String getCustomer() {
        return customer;
    }
    public void setCustomer(String arg) {
        customer = arg;
    }
}

