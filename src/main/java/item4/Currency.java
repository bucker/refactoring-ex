package item4;

import java.util.HashMap;
import java.util.Map;

/**
 * Change Reference to Value
 * 1. Check is there any immutable object
 * 2. Add equal() and hashCode()
 */
public class Currency {
    // currency list, a bunch reference of currency
    private static Map<String, Currency> currencies = new HashMap<>();

    static void loadCurrency() {
        currencies.put("USD", new Currency("USD"));
        currencies.put("TWD", new Currency("TWD"));
    }

    // immutable value
    private String code;

    public static Currency get(String code) {
        return currencies.get(code);
    }

    public String getCode() {
        return code;
    }

    private Currency(String code) {
        this.code = code;
    }

}
