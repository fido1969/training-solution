package week06d01;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ListSelectorTest {

    @Test
    void listSelectorTest(){
        ListSelector listSelector = new ListSelector();
        List<String> list = Arrays.asList("aa", "bb", "cc", "dd", "ee", "ff", "gg", "hh");
        assertEquals("[aacceegg]",listSelector.ListSelector(list).toString());
    }

    @Test
    void listSelectorTest1(){
        ListSelector listSelector = new ListSelector();
        List<String> list = Arrays.asList();
        assertEquals("",listSelector.ListSelector(list).toString());
    }





}