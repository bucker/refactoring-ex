package item3;

import org.junit.Test;

import static org.junit.Assert.*;

public class OrderTest {
    @Test
    public void getCustomerName() {
        String name = "Lemon Car Hire";
        Order order = new Order(name);
        assertEquals(name, order.getCustomerName());
    }

}