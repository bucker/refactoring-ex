package item13;

/**
 * Replace Type Code with Class
 *
 * 1. Create BloodGroup class, put the type code into it
 * 2. Change the type code in Person, replacing with BloodGroup
 * 3. Add new getter/setter that accept BloodGroup
 * 4. Remove the old getter/setter
 */
public class Person {
    public static final int O = 0;
    public static final int A = 1;
    public static final int B = 2;
    public static final int AB = 3;
    private int bloodGroup;

    public Person(int bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public void setBloodGroup(int arg) {
        bloodGroup = arg;
    }

    public int getBloodGroup() {
        return bloodGroup;
    }
}
