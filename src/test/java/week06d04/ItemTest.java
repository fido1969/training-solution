package week06d04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ItemTest {

    @Test
    void ifNameIsWrongTest() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> new Item(1200, 2, ""));
        assertEquals("Name can not be blank.",ex.getMessage());
    }
    @Test
    void ifMonthIsZero() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> new Item(1500, 0, "Anna"));
        assertEquals("Ivalid month value.", ex.getMessage());
    }
    @Test
    void ifPriceIsNegative() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> new Item(-2000, 9, "Pál"));
        assertEquals("Price must be greater than zero.", ex.getMessage());
    }

    @Test
    void itemNameTest() {
        Item items = new Item(15000,6,"János");
        assertEquals("János",items.getName());
    }
    @Test
    void itemPriceTest() {
        Item items = new Item(15000,6,"János");
        assertEquals(15000,items.getPrice());
    }
    @Test
    void itemMonthTest() {
        Item items = new Item(15000,6,"János");
        assertEquals(6,items.getMonth());
    }

}