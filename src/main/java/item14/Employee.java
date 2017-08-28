package item14;

/**
 * Replace Type Code with Subclasses
 * 1. Add Employee.create(type)
 * 2. Add Engineer subclass
 * 3. Add Engineer constructor in Employee.create
 * 4. Continue to add other employee type
 * 5. Once done, you can Push Down Method/Field to the subclasses
 */
public class Employee {
    private int type;
    static final int ENGINEER = 0;
    static final int SALESMAN = 1;
    static final int MANAGER = 2;

    Employee(int type) {
        this.type = type;
    }

    public int getType() {
        return type;
    }
}
