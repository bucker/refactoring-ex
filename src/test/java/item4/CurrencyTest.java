package item4;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CurrencyTest {

    @Before
    public void setup() {
        Currency.loadCurrency();
    }

    @Test
    public void getCode() {
        String currencyCode = "USD";
        Currency currency = Currency.get(currencyCode);
        assertEquals(currencyCode, currency.getCode());
    }

}