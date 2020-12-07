package week07d01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathAlgorithmsTest {

    @Test
    public void primCanNotBeSmallerThanZeroTest(){
        Exception ex=assertThrows(IllegalArgumentException.class,()->MathAlgorithms.isPrime(-6));
        assertEquals("Wrong parameter!",ex.getMessage());
    }

    @Test
    public void primCanNotBeZeroTest(){
        Exception ex=assertThrows(IllegalArgumentException.class,()->MathAlgorithms.isPrime(0));
        assertEquals("Wrong parameter!",ex.getMessage());
    }

    @Test
    public void primIsOneTest(){
        assertEquals(false,MathAlgorithms.isPrime(1));
    }

    @Test
    public void primIsTwoTest(){
        assertEquals(true,MathAlgorithms.isPrime(2));
    }

    @Test
    public void isPrimeTest(){
        assertEquals(true,MathAlgorithms.isPrime(3));
        assertEquals(true,MathAlgorithms.isPrime(5));
        assertEquals(true,MathAlgorithms.isPrime(7));
        assertEquals(true,MathAlgorithms.isPrime(13));
        assertEquals(true,MathAlgorithms.isPrime(17));
    }

    @Test
    public void isNotPrimeTest(){
        assertEquals(false,MathAlgorithms.isPrime(4));
        assertEquals(false,MathAlgorithms.isPrime(6));
        assertEquals(false,MathAlgorithms.isPrime(8));
        assertEquals(false,MathAlgorithms.isPrime(10));
        assertEquals(false,MathAlgorithms.isPrime(12));
    }

    @Test
    public void isPrimeOtherWayTest(){
        Exception ex = assertThrows(IllegalArgumentException.class, () -> MathAlgorithms.isPrimeOtherWay(-5));
        assertEquals("Wrong parameter!",ex.getMessage());
    }

    @Test
    public void isPrimeOtherWayZeroTest(){
        Exception ex = assertThrows(IllegalArgumentException.class, () -> MathAlgorithms.isPrimeOtherWay(0));
        assertEquals("Wrong parameter!",ex.getMessage());
    }

    @Test
    public void isPrimeOtherWayTest0(){
        assertFalse(MathAlgorithms.isPrimeOtherWay(1));
        assertTrue(MathAlgorithms.isPrimeOtherWay(5));
        assertFalse(MathAlgorithms.isPrimeOtherWay(8));
        assertTrue(MathAlgorithms.isPrimeOtherWay(11));
    }
}