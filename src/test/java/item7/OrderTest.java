package item7;

import org.junit.Test;

import static org.junit.Assert.*;

public class OrderTest {

    @Test
    public void getCustomer() {
        Customer customer = new Customer();
        Order order = new Order();
        order.setCustomer(customer);
        assertEquals(customer, order.getCustomer());
    }

}