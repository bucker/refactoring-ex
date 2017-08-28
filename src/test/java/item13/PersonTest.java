package item13;

import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {

    @Test
    public void testBloodGroupA() {
        Person a = new Person(Person.A);
        assertEquals(Person.A, a.getBloodGroup());
    }

    @Test
    public void testBloodGroupB() {
        Person b = new Person(Person.B);
        assertEquals(Person.B, b.getBloodGroup());
    }

    @Test
    public void testBloodGroupO() {
        Person o = new Person(Person.O);
        assertEquals(Person.O, o.getBloodGroup());
    }

    @Test
    public void testBloodGroupAB() {
        Person ab = new Person(Person.AB);
        assertEquals(Person.AB, ab.getBloodGroup());
    }
}