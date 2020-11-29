package algorithmssum.integers;

import java.util.List;

public class IntegerSumCalculator {

    public int sum(List<Integer> numbersInt) {
        int sum = 0;
        for (Integer integer : numbersInt) {
            sum += integer;
        }
        return sum;
    }
}
