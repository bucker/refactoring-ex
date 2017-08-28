package item4;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CurrencyFinalTest {

    @Test
    public void equalCurrency() {
        String code = "USD";
        assertEquals(new CurrencyFinal(code), new CurrencyFinal(code));
    }
}