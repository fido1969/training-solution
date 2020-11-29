package algorithmsmax.integers;

import java.util.List;

public class IntegerMaxCalculator {

    public int integerMaxCalculator(List<Integer> integerNumbers) {
        int maxInteger = Integer.MIN_VALUE;
        for (Integer integer : integerNumbers) {
            if (integer > maxInteger) {
                maxInteger = integer;
            }
        }
        return maxInteger;
    }
}

