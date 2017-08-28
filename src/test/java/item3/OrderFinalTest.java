package item3;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class OrderFinalTest {
    @Before
    public void loadCustomerAtStart() {
        CustomerFinal.loadCustomers();
    }

    @Test
    public void getCustomerName() throws Exception {
        String name = "Lemon Car Hire";
        OrderFinal order = new OrderFinal(name);
        assertEquals(name, order.getCustomerName());
    }

}