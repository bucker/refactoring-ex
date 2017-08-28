package item11;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class PersonFinal {
    private Set<Course> courses = new HashSet<>();

    public Set<Course> getCourses() {
        return Collections.unmodifiableSet(courses);
    }

    public void initializeCourses(Set<Course> arg) {
        for (Course c : arg) {
            addCourse(c);
        }
//        courses.addAll(arg);
    }

    public void addCourse(Course arg) {
        courses.add(arg);
    }

    public void removeCourse(Course arg) {
        courses.remove(arg);
    }

}
