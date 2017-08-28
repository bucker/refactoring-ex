package item11;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class PersonTest {

    @Test
    public void getCourses() {
        Person p = new Person();
        Course c = new Course("name", true);
        Course c2 = new Course("name", true);
        Set<Course> courses = new HashSet<>();
        courses.add(c);

        p.setCourses(courses);
        assertEquals(true, p.getCourses().contains(c));
        assertEquals(false, p.getCourses().contains(c2));
    }
}