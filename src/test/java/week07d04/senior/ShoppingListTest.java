package week07d04.senior;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShoppingListTest {

    ShoppingList s = new ShoppingList();

    @Test
    public void testShopping() {
        assertEquals(340, s.calculateSum("/shoppingList.txt"));
    }

    @Test
    public void testNull(){
        IllegalArgumentException iae =assertThrows(IllegalArgumentException.class,()->s.calculateSum(null));
        assertEquals("Invalid path!",iae.getMessage());
    }

    @Test
    public void testEmpty(){
        IllegalArgumentException iae =assertThrows(IllegalArgumentException.class,()->s.calculateSum(""));
        assertEquals("Invalid path!",iae.getMessage());
    }

}