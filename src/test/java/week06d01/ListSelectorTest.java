package week06d01;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ListSelectorTest {

    ListSelector listSelector = new ListSelector();

    @Test
    void listSelectorWithEvenIndexElementsTest(){
        assertEquals("[aa,cc,ee,gg]",listSelector.getEvenIndexElements(Arrays.asList("aa", "bb", "cc", "dd", "ee", "ff", "gg", "hh")).toString());
    }

    @Test
    void listSelectorWithEmptyListTest(){
        assertEquals("",listSelector.getEvenIndexElements(Arrays.asList()).toString());
    }

    @Test
    void listSelectorWithNullTest(){
        assertThrows(IllegalArgumentException.class,()->listSelector.getEvenIndexElements(null));
    }
}