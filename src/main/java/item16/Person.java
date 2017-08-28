package item16;

/**
 * Replace Subclass with Fields
 * 1. Replace constructor with Factory Method, put createMale(), createFemale() inside Person
 * 2. Replace the reference of constructor
 * 3. Make the subclass private
 * 4. Declare final fields for each constant
 * 5. Add constructor on the superclass, call super at subclass
 * 6. Eliminating the subclass methods, put them in superclass
 * 7. Inlining the constructor
 * 8. Eliminating the subclass
 */
abstract class Person {
    abstract boolean isMale();

    abstract char getCode();

    static class Male extends Person {
        boolean isMale() {
            return true;
        }

        char getCode() {
            return 'M';
        }
    }

    static class Female extends Person {
        boolean isMale() {
            return false;
        }

        char getCode() {
            return 'F';
        }
    }
}
