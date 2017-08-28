package item3;

import java.util.Dictionary;
import java.util.Hashtable;

public class CustomerFinal {
    private static Dictionary<String, CustomerFinal> instances = new Hashtable<>();
    private final String name;

    static void loadCustomers() {
        new CustomerFinal("Lemon Car Hire").store();
        new CustomerFinal("Associated Coffee Machines").store();
        new CustomerFinal("Bilston Gasworks").store();
    }

    private void store() {
        instances.put(this.getName(), this);
    }

    public static CustomerFinal create(String name) {
        return instances.get(name);
    }

    private CustomerFinal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
