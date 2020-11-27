package week05d05;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    public void createValidEmailTest() {
        User user = new User("Szabadkai", "János", "szabadkai.janos@freemail.hu");
        assertEquals("szabadkai.janos@freemail.hu", user.getEmail());
    }

    @Test
    public void createNotValidEmailTest() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            throw new IllegalArgumentException("Email address in not correct, \\'@\\' is missing");
        });
    }
}


