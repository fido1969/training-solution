package algorithmscount.trainer;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AgeConditionCounterTest {

    @Test
    public void ageConditionCounterTest() {
        AgeConditionCounter ageConditionCounter = new AgeConditionCounter();
        List<Trainer> trainers = new ArrayList<>();
        assertEquals(0,ageConditionCounter.countElderly(trainers,40));
        assertEquals(0,trainers.size());
    }

    @Test
    public void ageConditionCounterTest1() {
        AgeConditionCounter ageConditionCounter = new AgeConditionCounter();
        List<Trainer> trainers = new ArrayList<>();
        trainers.add(new Trainer("János",51));
        trainers.add(new Trainer("Béla",39));
        trainers.add(new Trainer("Károly",40));
        assertEquals(1,ageConditionCounter.countElderly(trainers,40));
    }

}