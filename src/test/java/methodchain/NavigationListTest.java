package methodchain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NavigationListTest {

    NavigationList navigationList=new NavigationList(15,25);

    @Test
    void getActualDistance() {
        assertEquals(15,navigationList.getActualDistance());
    }

    @Test
    void getActualAzimut() {
        assertEquals(25,navigationList.getActualAzimut());
    }

    @Test
    void testToString() {
        assertEquals("distance: 15 azimut: 25",navigationList.toString());
    }
}