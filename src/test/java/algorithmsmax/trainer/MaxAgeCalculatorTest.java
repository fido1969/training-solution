package algorithmsmax.trainer;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MaxAgeCalculatorTest {

    @Test
    public void maxAgeCalculatorTest(){
        MaxAgeCalculator maxAgeCalculator = new MaxAgeCalculator();
        List<Trainer> trainerList=Arrays.asList(
            new Trainer("Anna",27),
            new Trainer("Panka",40),
            new Trainer("Marcsa",41)
        );
        assertEquals(41,maxAgeCalculator.trainerWithMaxAge(trainerList).getAge());
    }

}