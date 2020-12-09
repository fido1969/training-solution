package week07d03;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NumberListTest {

    @Test
    public void test(){
        NumberList numberList = new NumberList();
        List<Integer> integers = Arrays.asList(1,5,7,2,5,1);
        assertEquals(false,numberList.isIncreasing(integers));
    }

    @Test
    public void test1(){
        NumberList numberList = new NumberList();
        assertFalse(numberList.isIncreasing(Arrays.asList(1,5,7,2,5,1)));
        assertFalse(numberList.isIncreasing(Arrays.asList(1,5,7,2,2)));
        assertTrue(numberList.isIncreasing(Arrays.asList(1,5,7,7,7)));
        assertTrue(numberList.isIncreasing(Arrays.asList(1,5,7,21,51,101)));

    }


}