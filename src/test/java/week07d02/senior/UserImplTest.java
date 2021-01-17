package week07d02.senior;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserImplTest {

    @Test
    public void userImplTest() {
        assertEquals("János Szabadkai", new UserImpl("fido", "János", "Szabadkai").getFullName());
        assertEquals("fido", new UserImpl("fido", "János", "Szabadkai").getUsername());
        assertEquals("János", new UserImpl("fido", "János", "Szabadkai").getFirstName());
        assertEquals("Szabadkai", new UserImpl("fido", "János", "Szabadkai").getLastName());
    }
}