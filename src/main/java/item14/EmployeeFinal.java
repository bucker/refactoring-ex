package item14;

/**
 * Replace Type Code with Subclasses
 * 1. Add Employee.create(type)
 */
public class EmployeeFinal {
    private int type;
    static final int ENGINEER = 0;
    static final int SALESMAN = 1;
    static final int MANAGER = 2;

    static EmployeeFinal create(int type) {
        switch (type) {
            case ENGINEER:
                return new Engineer();
            case SALESMAN:
                return new Salesman();
            case MANAGER:
                return new Manager();
            default:
                throw new IllegalArgumentException("Incorrect type code value");
        }
    }

    private EmployeeFinal(int type) {
        this.type = type;
    }

    public int getType() {
        return type;
    }

    static class Engineer extends EmployeeFinal {
        Engineer() {
            super(ENGINEER);
        }

        public int getType() {
            return Employee.ENGINEER;
        }
    }

    static class Salesman extends EmployeeFinal {
        Salesman() {
            super(SALESMAN);
        }

        public int getType() {
            return Employee.SALESMAN;
        }
    }

    static class Manager extends EmployeeFinal {
        Manager() {
            super(MANAGER);
        }

        public int getType() {
            return Employee.MANAGER;
        }
    }
}
