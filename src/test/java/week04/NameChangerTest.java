package week04;

import org.junit.jupiter.api.Test;
import week04.NameChanger;

import static org.junit.jupiter.api.Assertions.*;

class NameChangerTest {

    NameChanger nameChanger = new NameChanger("Szabadkai János");

    @Test
    public void testCreateFullName() {
        System.out.println(nameChanger.getFullName());
        assertEquals("Szabadkai János", nameChanger.getFullName());
    }

    @Test
    public void testCreateFullNameWithNull() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> new NameChanger(null));
        assertEquals("Invalid name:[paraméter értéke]!", ex.getMessage());
    }

    @Test
    public void testCreateEmptyFullName() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> new NameChanger(""));
        assertEquals("Invalid name:[paraméter értéke]!", ex.getMessage());
    }

    @Test
    public void testChangeFamilyName() {
        assertEquals("Kapás János", nameChanger.changeFamilyName("Kapás"));
        System.out.println(nameChanger.getFullName());
    }

    @Test
    public void testchangeFirstName() {
        assertEquals("Szabadkai Anna", nameChanger.changeFirstName("Anna"));
        System.out.println(nameChanger.getFullName());
    }

    @Test
    public void testchangeFirstName1() {
        assertEquals("Szabadkai Péter", nameChanger.changeFirstName("Péter"));
        System.out.println(nameChanger.getFullName());
    }

    @Test
    public void testNameIsSame() {
        assertEquals(true, nameChanger.nameIsSame("Szabadkai János"));
        assertTrue(nameChanger.nameIsSame("Szabadkai János"));
    }

    @Test
    public void testNameIsNotSame() {
        assertEquals(false, nameChanger.nameIsSame("Szabadkai Anna"));
        assertFalse(nameChanger.nameIsSame("Szabadkai Anna"));
    }
}