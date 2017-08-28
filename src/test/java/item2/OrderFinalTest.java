package item2;

import org.junit.Test;

import static org.junit.Assert.*;

public class OrderFinalTest {
    @Test
    public void getCustomer() {
        String name = "nnn";
        OrderFinal order = new OrderFinal(name);
        assertEquals(name, order.getCustomerName());
    }
}