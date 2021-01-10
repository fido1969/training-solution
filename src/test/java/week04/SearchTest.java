package week04;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SearchTest {

    Search search =new Search();

    @Test
    public void getIndexesOfCharTest() {
        List<Integer> getIndexesOfChar= Arrays.asList(0,3,5);
        assertEquals(getIndexesOfChar,search.getIndexesOfChar("almafa", 'a'));
    }

    @Test
    public void getIndexesOfCharTest1() {
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () -> search.getIndexesOfChar("almafa", ' '));
        assertEquals("Wrong character!",iae.getMessage());
    }

    @Test
    public void getIndexesOfCharTest2() {
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () -> search.getIndexesOfChar(null, 'a'));
        assertEquals("Wrong data!",iae.getMessage());
    }

    @Test
    public void getIndexesOfCharTest3() {
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () -> search.getIndexesOfChar("", 'a'));
        assertEquals("Wrong data!",iae.getMessage());
    }


}