package item15;

/**
 * Replace Type Code with State/Strategy
 * 1. Create a state class EmployeeType
 * 2. use getType() in switch
 * 3. Add subclass that extends EmployeeType
 * 4. Put the switch
 */
public class Employee {
    private int type;
    // Todo: put these with another class EmployeeType
    static final int ENGINEER = 0;
    static final int SALESMAN = 1;
    static final int MANAGER = 2;
    private int monthlySalary = 10000;
    private int commission = 1000;
    private int bonus = 2000;

    Employee(int type) {
        setType(type);
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    int payAmount() {
        switch (type) {
            case ENGINEER:
                return monthlySalary;
            case SALESMAN:
                return monthlySalary + commission;
            case MANAGER:
                return monthlySalary + bonus;
            default:
                throw new RuntimeException("Incorrect Employee");
        }
    }
}
