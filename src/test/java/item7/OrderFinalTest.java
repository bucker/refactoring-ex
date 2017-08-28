package item7;

import org.junit.Test;

import static org.junit.Assert.*;

public class OrderFinalTest {

    @Test
    public void testGetCustomer() {
        Customer customer = new Customer();
        Order order = new Order();
        order.setCustomer(customer);
        assertEquals(customer, order.getCustomer());
    }
}