package item16;

class PersonFinal {
    private final boolean isMale;
    private final char code;

    private PersonFinal(boolean isMale, char code) {
        this.isMale = isMale;
        this.code = code;
    }

    boolean isMale() {
        return isMale;
    }

    char getCode() {
        return code;
    }

    static PersonFinal createMale() {
        return new PersonFinal(true, 'M');
    }

    static PersonFinal createFemale() {
        return new PersonFinal(false, 'F');
    }
}
