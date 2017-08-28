package item13;

import org.junit.Test;

import static org.junit.Assert.*;

public class PersonFinalTest {

    @Test
    public void testBloodGroupA() {
        PersonFinal a = new PersonFinal(BloodGroup.A);
        assertEquals(BloodGroup.A, a.getBloodGroup());
    }

    @Test
    public void testBloodGroupB() {
        PersonFinal b = new PersonFinal(BloodGroup.B);
        assertEquals(BloodGroup.B, b.getBloodGroup());
    }

    @Test
    public void testBloodGroupO() {
        PersonFinal o = new PersonFinal(BloodGroup.O);
        assertEquals(BloodGroup.O, o.getBloodGroup());
    }

    @Test
    public void testBloodGroupAB() {
        PersonFinal ab = new PersonFinal(BloodGroup.AB);
        assertEquals(BloodGroup.AB, ab.getBloodGroup());
    }
}