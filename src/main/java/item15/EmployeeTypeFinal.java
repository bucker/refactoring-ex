package item15;

import item15.EmployeeFinal.Engineer;
import item15.EmployeeFinal.Manager;
import item15.EmployeeFinal.Salesman;

class EmployeeTypeFinal {

    static EmployeeTypeFinal newType(int code) {
        switch (code) {
            case ENGINEER:
                return new Engineer();
            case SALESMAN:
                return new Salesman();
            case MANAGER:
                return new Manager();
            default:
                throw new IllegalArgumentException("Incorrect Employee Code");
        }
    }

    int getTypeCode() {
        return -1;
    }

    static final int ENGINEER = 0;
    static final int SALESMAN = 1;
    static final int MANAGER = 2;
}
