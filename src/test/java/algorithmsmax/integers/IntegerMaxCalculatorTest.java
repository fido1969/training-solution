package algorithmsmax.integers;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class IntegerMaxCalculatorTest {

    @Test
    public void integerMaxCalculatorTest(){
        List<Integer> integerList = Arrays.asList(15,20,45,78,11,36);
        IntegerMaxCalculator integerMaxCalculator = new IntegerMaxCalculator();
        assertEquals(78,integerMaxCalculator.integerMaxCalculator(integerList));
    }

}