package week07d01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathAlgorithmsTest {


    @Test
    public void primCanNotBeZeroTest(){
        Exception ex=assertThrows(IllegalArgumentException.class,()->MathAlgorithms.isPrime(0));
        assertEquals("'Number 'X'' can not be smaller than '2'!",ex.getMessage());
    }

    @Test
    public void primCanNotBeOneTest(){
        Exception ex=assertThrows(IllegalArgumentException.class,()->MathAlgorithms.isPrime(1));
        assertEquals("'Number 'X'' can not be smaller than '2'!",ex.getMessage());
    }

    @Test
    public void primCanBelargerThanOneTest(){
        Exception ex=assertThrows(IllegalArgumentException.class,()->MathAlgorithms.isPrime(-6));
        assertEquals("'Number 'X'' can not be smaller than '2'!",ex.getMessage());
    }

    @Test
    public void isPrimeTest(){
        assertEquals(true,MathAlgorithms.isPrime(11));
    }

    @Test
    public void isNotPrimeTest(){
        assertEquals(false,MathAlgorithms.isPrime(8));
    }
}