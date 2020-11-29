package algorithmsmax.trainer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrainerTest {

    @Test
    public void trainerTest(){
        Trainer trainer= new Trainer("János",51);
        assertEquals("János",trainer.getName());
        assertEquals(51,trainer.getAge());
    }
}