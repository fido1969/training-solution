package week08d03;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StringListTest {

    StringList sl = new StringList();
    List<String> first = List.of("word", "letter", "number", "wind", "flow", "animal", "last");
    List<String> second = List.of("word", "letter", "caracter", "bracket", "dot", "comma", "last");

    @Test
    public void testList() {
        List<String> testlist = sl.stringListsUnion(first, second);
        assertEquals(11, testlist.size());
    }

    @Test
    public void testListNull() {
        Exception ex = assertThrows(NullPointerException.class, () -> sl.stringListsUnion(first, null));
        assertEquals("List can not be empty", ex.getMessage());
    }

    @Test
    public void testListEmpty() {
        Exception ex = assertThrows(NullPointerException.class, () -> sl.stringListsUnion(List.of(), second));
        assertEquals("List can not be empty", ex.getMessage());
    }

}