package week05d05;

import org.junit.jupiter.api.Test;
import week05d04.Product;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    public void createValidEmailTest() {
        User user = new User("Szabadkai", "János", "szabadkai.janos@freemail.hu");
        assertEquals("szabadkai.janos@freemail.hu",user.getEmail());
    }

}