package item16;

import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {

    @Test
    public void isMale() {
        Person male = new Person.Male();
        assertEquals(true, male.isMale());
    }

    @Test
    public void isFemale() {
        Person female = new Person.Female();
        assertEquals(false, female.isMale());
    }

    @Test
    public void maleCode() {
        Person male = new Person.Male();
        char expected = 'M';
        assertEquals(expected, male.getCode());
    }

    @Test
    public void femaleCode() {
        Person female = new Person.Female();
        char expected = 'F';
        assertEquals(expected, female.getCode());
    }
}