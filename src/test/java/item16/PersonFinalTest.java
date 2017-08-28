package item16;

import org.junit.Test;

import static org.junit.Assert.*;

public class PersonFinalTest {

    @Test
    public void isMale() {
        PersonFinal male = PersonFinal.createMale();
        assertEquals(true, male.isMale());
    }

    @Test
    public void isFemale() {
        PersonFinal female = PersonFinal.createFemale();
        assertEquals(false, female.isMale());
    }

    @Test
    public void maleCode() {
        PersonFinal male = PersonFinal.createMale();
        char expected = 'M';
        assertEquals(expected, male.getCode());
    }

    @Test
    public void femaleCode() {
        PersonFinal female = PersonFinal.createFemale();
        char expected = 'F';
        assertEquals(expected, female.getCode());
    }
}