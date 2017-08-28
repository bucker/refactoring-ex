package item11;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonFinalTest {
    @Test
    public void getCourses() {
        PersonFinal p = new PersonFinal();
        Course c = new Course("name", true);
        p.addCourse(c);

        assertEquals(true, p.getCourses().contains(c));
    }

}