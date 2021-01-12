package week05d03.senior;

import org.junit.jupiter.api.Test;
import week05d03.senior.User;
import week05d03.senior.UserValidator;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UserValidatorTest {

    @Test
    public void testUserValidator() {
        List<User> users = new ArrayList<>();
        users.add(new User("János",51));
        assertEquals("János",users.get(0).getName());
        assertEquals(51,users.get(0).getAge());
    }

    @Test
    public void testUserValidatorListIsEmpty() {
        List<User> users = new ArrayList<>();
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () -> new UserValidator().validate(users));
        assertEquals("Empty list!", iae.getMessage());
    }

    @Test
    public void testUserValidatorListIsNull() {
        List<User> users = null;
        NullPointerException npe = assertThrows(NullPointerException.class, () -> new UserValidator().validate(users));
        assertEquals("Users is null", npe.getMessage());
    }

    @Test
    public void testUserValidatorWithNameNull() {
        List<User> users = new ArrayList<>();
        users.add(new User(null, 50));
        IllegalArgumentException npe = assertThrows(IllegalArgumentException.class, () -> new UserValidator().validate(users));
        assertEquals("Name can not be null or empty! [null ; 50]", npe.getMessage());
    }

    @Test
    public void testUserValidatorWithNameIsBlank() {
        List<User> users = new ArrayList<>();
        users.add(new User("   ", 100));
        IllegalArgumentException npe = assertThrows(IllegalArgumentException.class, () -> new UserValidator().validate(users));
        assertEquals("Name can not be null or empty! [    ; 100]", npe.getMessage());
    }

    @Test
    public void testUserValidatorAgeSmallerThanZero() {
        List<User> users = new ArrayList<>();
        users.add(new User("János", -51));
        IllegalArgumentException npe = assertThrows(IllegalArgumentException.class, () -> new UserValidator().validate(users));
        assertEquals("The age must be between 0 and 120! [János ; -51]", npe.getMessage());
    }

    @Test
    public void testUserValidatorAgeLargerThan120() {
        List<User> users = new ArrayList<>();
        users.add(new User("János", 150));
        IllegalArgumentException npe = assertThrows(IllegalArgumentException.class, () -> new UserValidator().validate(users));
        assertEquals("The age must be between 0 and 120! [János ; 150]", npe.getMessage());
    }

    @Test
    public void testUserValidatorWithUserNull() {
        List<User> users = new ArrayList<>();
        User user = null;
        users.add(user);
        NullPointerException npe = assertThrows(NullPointerException.class, () -> new UserValidator().validate(users));
        assertEquals("User is null!", npe.getMessage());
    }

}