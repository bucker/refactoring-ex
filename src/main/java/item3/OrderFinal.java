package item3;

/**
 * Change Value to Reference
 * 1. Replace Constructor with Factory Method: Customer.create()
 * 2. Change `new Customer` to `Customer.create`
 * 3. Load customer from start-up: `static Dictionary instances`
 * 4. Modify factory method, return pre-loaded customer object
 */
public class OrderFinal {
    private CustomerFinal customer;

    public OrderFinal(String customerName) {
        customer = CustomerFinal.create(customerName);
    }

    public void setCustomer(String customerName) {
        customer = CustomerFinal.create(customerName);
    }

    public String getCustomerName() {
        return customer.getName();
    }
}

