package item8;

import org.junit.Test;

import static org.junit.Assert.*;

public class OrderFinalTest {
    @Test
    public void getDiscountedPrice() {
        OrderFinal order = new OrderFinal();
        CustomerFinal customer = new CustomerFinal();

        double expected = order.getGrossPrice() * (1 - customer.getDiscount());

        assertEquals(expected, customer.getPriceFor(order), 0.01);
    }

}