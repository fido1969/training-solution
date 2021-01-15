package week06d05.senior;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BottleTest {

    @Test
    void getType() {
        assertEquals(BottleType.PET_BOTTLE,new Bottle(BottleType.PET_BOTTLE,100).getType());
    }

    @Test
    void getFilledUnit() {
        assertEquals(100,new Bottle(BottleType.PET_BOTTLE,100).getFilledUnit());
    }

    @Test
    void getFilledUntil() {
        assertEquals(100,new Bottle(BottleType.PET_BOTTLE,100).getFilledUnit());
    }


    @Test
    void fill() {
        Bottle b = new Bottle(BottleType.GLASS_BOTTLE, 100);
        b.fill(50);
        assertEquals(150, b.getFilledUnit());
    }

    @Test
    public void tesztBottleErr() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> new Bottle(BottleType.GLASS_BOTTLE, 300).fill(1));
        assertEquals("Bottle is overloaded!", ex.getMessage());
    }

    @Test
    public void tesztBottleNoFill() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> new Bottle(BottleType.GLASS_BOTTLE, 0));
        assertEquals("Quantity can not be smaller than 0!", ex.getMessage());
    }
}