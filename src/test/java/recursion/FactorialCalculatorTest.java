package recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialCalculatorTest {

    @Test
    public void factorialCalculatorTest() {
        int number = 4;
        long actual= new FactorialCalculator().getFactorial(number);
        assertEquals(actual,24L);
    }

    @Test
    public void factorialCalculatorTest1() {
        int number = 5;
        long actual= new FactorialCalculator().getFactorial(number);
        assertEquals(actual,120L);
    }

}