package item1;

/**
 * Self-Encapsulate Field/Encapsulate Field (item 10)
 * 1. Create a getter/setter for the field
 * 2. Find all ref to the field, replace them with getter/setter
 * 3. Make the field private
 * 4. Double check that you have caught all ref
 * 5. Compile and test
 * */
public class IntRange {
    public int low, high;

    IntRange(int low, int high) {
        this.low = low;
        this.high = high;
    }

//    In case the setter and the constructor have different behavior
//    item1.IntRange(int low, int high) {
//        initialize(low, high);
//    }
//    private void initialize(int low, int high) {
//        this.low = low;
//        this.high = high;
//    }

    boolean includes(int arg) {
        return arg >= low && arg <= high;
    }

    void grow(int factor) {
        high = high * factor;
    }

}
