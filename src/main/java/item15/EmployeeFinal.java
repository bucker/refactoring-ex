package item15;

public class EmployeeFinal {
    private EmployeeTypeFinal type;
    private int monthlySalary = 10000;
    private int commission = 1000;
    private int bonus = 2000;

    EmployeeFinal(int type) {
        setType(type);
    }

    public int getType() {
        return type.getTypeCode();
    }

    public void setType(int type) {
        this.type = EmployeeTypeFinal.newType(type);
    }

    int payAmount() {
        switch (getType()) {
            case EmployeeTypeFinal.ENGINEER:
                return monthlySalary;
            case EmployeeTypeFinal.SALESMAN:
                return monthlySalary + commission;
            case EmployeeTypeFinal.MANAGER:
                return monthlySalary + bonus;
            default:
                throw new RuntimeException("Incorrect Employee");
        }
    }

    public static class Engineer extends EmployeeTypeFinal {
        int getTypeCode () {
            return Employee.ENGINEER;
        }
    }
    public static class Manager extends EmployeeTypeFinal {
        int getTypeCode () {
            return Employee.MANAGER;
        }
    }
    public static class Salesman extends EmployeeTypeFinal {
        int getTypeCode () {
            return Employee.SALESMAN;
        }
    }
}
