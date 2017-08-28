package item4;

/**
 * Change Reference to Value
 * 1. Check is there any immutable object
 * 2. Add equal() and hashCode()
 */
public class CurrencyFinal {
    // immutable value
    private final String code;

    public String getCode() {
        return code;
    }

    public CurrencyFinal(String code) {
        this.code = code;
    }

    public boolean equals(Object arg) {
        if (! (arg instanceof CurrencyFinal)) return false;
        CurrencyFinal other = (CurrencyFinal) arg;
        return (code.equals(other.code));
    }

    public int hashCode() {
        return code.hashCode();
    }
}
