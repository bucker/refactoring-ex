package item8;

import org.junit.Test;

import static org.junit.Assert.*;

public class OrderTest {

    @Test
    public void testDiscountedPrice() {
        Order order = new Order();
        Customer customer = new Customer();
        order.setCustomer(new Customer());
        double expected = order.getGrossPrice() * (1 - customer.getDiscount());
        assertEquals(expected, order.getDiscountedPrice(), 0.01);
    }
}