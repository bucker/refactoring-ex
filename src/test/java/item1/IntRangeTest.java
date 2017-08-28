package item1;

import org.junit.Test;

import static org.junit.Assert.*;

public class IntRangeTest {

    @Test
    public void includes() {
        int low = 1;
        int high = 2;
        IntRange intRange = new IntRange(low, high);
        assertEquals(true, intRange.includes(high));
    }

    @Test
    public void grow() {
        int low = 1;
        int high = 10;
        int factor = 2;
        IntRange intRange = new IntRange(low, high);
        intRange.grow(factor);

        int expected = high * factor;
        int actual = intRange.high;
        assertEquals(expected, actual);
    }

}