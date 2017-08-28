package item1;

import org.junit.Test;

import static org.junit.Assert.*;

public class IntRangeFinalTest {

    @Test
    public void includes() {
        int low = 1;
        int high = 2;
        IntRangeFinal intRange = new IntRangeFinal(low, high);
        assertEquals(true, intRange.includes(high));
    }

    @Test
    public void grow() {
        int low = 1;
        int high = 10;
        int factor = 2;
        IntRangeFinal intRange = new IntRangeFinal(low, high);
        intRange.grow(factor);

        int expected = high * factor;
        int actual = intRange.getHigh();
        assertEquals(expected, actual);
    }
}