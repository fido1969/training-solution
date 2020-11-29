package algorithmssum.trainers;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AgeSumCalculatorTest {

    @Test
    public void ageSumCalculatorTest() {
        AgeSumCalculator ageSumCalculator = new AgeSumCalculator();
        List<Trainer> trainerList = new ArrayList<>();
        trainerList.add(new Trainer("Kiss Pál",60));
        trainerList.add(new Trainer("Nagy Zoltán",40));
        trainerList.add(new Trainer("Peter Folk",30));
        assertEquals(130,ageSumCalculator.ageSumCalculator(trainerList));
    }

    @Test
    public void ageSumCalculatorLenghtTest() {
        List<Trainer> trainerList = new ArrayList<>();
        trainerList.add(new Trainer("Kiss Pál",60));
        trainerList.add(new Trainer("Nagy Zoltán",40));
        trainerList.add(new Trainer("Peter Folk",30));
        assertEquals(3,trainerList.size());
    }

    @Test
    public void ageSumCalculatorEmptyTest() {
        List<Trainer> trainerList = new ArrayList<>();
        assertEquals(0,trainerList.size());
    }
}