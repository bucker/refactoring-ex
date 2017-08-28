package item11;

import java.util.Set;

/**
 * Encapsulate Collection
 * 1. Add addCourse() and removeCourse()
 * 2. Use addCourse() in setCourses(), rename to initializeCourses()
 * 3. Modify getCourses(), make it immutable `Collections.unmodifiableSet`
 */
public class Person {
    private Set<Course> courses;

    // this is bad
    public Set<Course> getCourses() {
        return courses;
    }

    // this is so bad
    public void setCourses(Set<Course> arg) {
        courses = arg;
    }
}
