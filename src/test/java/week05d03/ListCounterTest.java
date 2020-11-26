package week05d03;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListCounterTest {

    @Test
    public void startWithoutAnATest() {
        ListCounter listCounter = new ListCounter();
        List<String> stringList = Arrays.asList("blue", "reset", "door");
        assertEquals(0,listCounter.setStringList(stringList) );
    }

    @Test
    public void startWithAnATest() {
        ListCounter listCounter = new ListCounter();
        List<String> stringList = Arrays.asList("Alma", "ablak", "ajtó");
        assertEquals(3,listCounter.setStringList(stringList) );
    }

    @Test
    public void startWithAnEmptyListTest() {
        ListCounter listCounter = new ListCounter();
        List<String> stringList = new ArrayList<>();
        assertEquals(0,listCounter.setStringList(stringList) );
    }

}
