package item2;

import org.junit.Test;

import static org.junit.Assert.*;

public class OrderTest {
    @Test
    public void getCustomer() {
        String name = "nnn";
        Order order = new Order(name);
        assertEquals(name, order.getCustomer());
    }

}