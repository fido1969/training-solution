package algorithmssum.trainers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrainerTest {

    @Test
    public void createTrainerTest(){
        Trainer trainer = new Trainer("Szabadkai János", 51);
        assertEquals("Szabadkai János",trainer.getName());
        assertEquals(51,trainer.getAge());
    }
}