package algorithmssum.integers;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class IntegerSumCalculatorTest {

    @Test
    public void SumCalculatorTest(){
        List<Integer> numbersInt = Arrays.asList(10,20,30,40);
        IntegerSumCalculator integerSumCalculator = new IntegerSumCalculator();
        assertEquals(100,integerSumCalculator.sum(numbersInt));
    }
}