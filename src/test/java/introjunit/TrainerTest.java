package introjunit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TrainerTest {

    @Test
    public void testCreate() {
        //Given
        Trainer trainer = new Trainer("John Doe");

        //When
        String name = trainer.getName();

        //Then
        assertEquals("John Doe", name);
    }

    @Test
    public void testCreate1() {

        assertEquals("", new Trainer("").getName());
    }

    @Test
    public void testUppercase() {

        assertEquals("JOHN DOE", new Trainer("John Doe").getNameUppercase());
    }

    @Test
    public void testSetter() {
        Trainer trainer = new Trainer("John Doe");
        trainer.setName("Jack Doe");

        assertEquals("Jack Doe",trainer.getName());
    }

}
