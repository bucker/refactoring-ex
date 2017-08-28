package item14;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EmployeeTest {

    @Test
    public void testEngineer() {
        Employee e = new Employee(Employee.ENGINEER);
        assertEquals(Employee.ENGINEER, e.getType());
    }

    @Test
    public void testSalesman() {
        Employee e = new Employee(Employee.SALESMAN);
        assertEquals(Employee.SALESMAN, e.getType());
    }

    @Test
    public void testManager() {
        Employee e = new Employee(Employee.MANAGER);
        assertEquals(Employee.MANAGER, e.getType());
    }
}