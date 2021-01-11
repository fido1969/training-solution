package week11d01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivisorFinderTest {

    DivisorFinder divisorFinder = new DivisorFinder();

    @Test
    public void testDivisorFinderWithDivisor() {
        assertEquals(3, divisorFinder.findDivisors(155));
    }

    @Test
    public void testDivisorFinderWithoutDivisor() {
        assertEquals(0, divisorFinder.findDivisors(29));
    }

    @Test
    public void testDivisorFinderWithNegativeNumber() {
        NumberFormatException ae = assertThrows(NumberFormatException.class, () -> divisorFinder.findDivisors(-17));
        assertEquals(null,ae.getMessage());
    }

    @Test
    public void testDivisorFinderWithZero() {
        ArithmeticException ae = assertThrows(ArithmeticException.class, () -> divisorFinder.findDivisors(0));
        assertEquals("/ by zero!",ae.getMessage());
    }
}