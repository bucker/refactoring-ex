package item1;

/**
 * Self-Encapsulate Field/Encapsulate Field
 * 1. Create a getter/setter for the field
 * 2. Find all ref to the field, replace them with getter/setter
 * 3. Make the field private
 * 4. Double check that you have caught all ref
 * 5. Compile and test
 * */
public class IntRangeFinal {
    private int low, high;

    IntRangeFinal(int low, int high) {
        initialize(low, high);
    }

    private void initialize(int low, int high) {
        this.low = low;
        this.high = high;
    }

    boolean includes(int arg) {
        return arg >= getLow() && arg <= getHigh();
    }

    void grow(int factor) {
        high = getHigh() * factor;
    }

    int getLow() {
        return low;
    }

    int getHigh() {
        return high;
    }
}
