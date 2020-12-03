package week06d04;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BudgetTest {

    Budget budget = new Budget(Arrays.asList(
            new Item(1250, 2, "Anna"),
            new Item(2500, 3, "Péter"),
            new Item(6500, 4, "Pál"),
            new Item(1500, 4, "Piri")
    ));

    @Test
    public void getItemsByMonth() {

        List<Item> resultList = budget.getItemsByMonth(4);
        assertEquals(2,resultList.size());
        assertEquals("Pál",resultList.get(0).getName());
        assertEquals(6500,resultList.get(0).getPrice());
        assertEquals(4,resultList.get(0).getMonth());
        assertEquals("Piri",resultList.get(1).getName());
        assertEquals(1500,resultList.get(1).getPrice());
        assertEquals(4,resultList.get(1).getMonth());
    }
}