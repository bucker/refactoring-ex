package item3;

import org.junit.Test;

import static org.junit.Assert.*;

public class CustomerTest {
    @Test
    public void getName() throws Exception {
        String name = "customer";
        Customer customer = new Customer(name);
        assertEquals(name, customer.getName());
    }
}