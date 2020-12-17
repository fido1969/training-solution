package week08d04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrainerTest {

    @Test
    public void testGoodMood() {
        Trainer goodTrainer = new Trainer(new GoodMood());
        assertEquals(5, goodTrainer.giveMark());
    }

    @Test
    public void testBadMood() {
        Trainer badTrainer = new Trainer(new BadMood());
        assertEquals(3, badTrainer.giveMark());
    }

}