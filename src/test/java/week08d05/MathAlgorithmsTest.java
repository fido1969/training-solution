package week08d05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathAlgorithmsTest {

    @Test
    public void greatestCommonDivisorTest() {
        MathAlgorithms mathAlgorithms = new MathAlgorithms();
        assertEquals(5,mathAlgorithms.greatestCommonDivisor(5,15));
        assertEquals(9,mathAlgorithms.greatestCommonDivisor(9,18));
    }

    @Test
    public void greatestCommonDivisorEuclideanTest() {
        MathAlgorithms mathAlgorithms = new MathAlgorithms();
        assertEquals(5,mathAlgorithms.greatestCommonDivisorEuclidean(5,15));
        assertEquals(9,mathAlgorithms.greatestCommonDivisorEuclidean(9,18));
    }

    @Test
    public void greatestCommonDivisorEuclideanOtherTest() {
        MathAlgorithms mathAlgorithms = new MathAlgorithms();
        assertEquals(5,mathAlgorithms.greatestCommonDivisorEuclideanOther(5,15));
        assertEquals(9,mathAlgorithms.greatestCommonDivisorEuclideanOther(9,18));
    }
}