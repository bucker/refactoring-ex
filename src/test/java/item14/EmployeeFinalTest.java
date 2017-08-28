package item14;

import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeFinalTest {
    @Test
    public void testEngineer() {
        EmployeeFinal e = EmployeeFinal.create(Employee.ENGINEER);
        assertEquals(EmployeeFinal.ENGINEER, e.getType());
    }

    @Test
    public void testSalesman() {
        EmployeeFinal e = EmployeeFinal.create(Employee.SALESMAN);
        assertEquals(EmployeeFinal.SALESMAN, e.getType());
    }

    @Test
    public void testManager() {
        EmployeeFinal e = EmployeeFinal.create(Employee.MANAGER);
        assertEquals(EmployeeFinal.MANAGER, e.getType());
    }
}