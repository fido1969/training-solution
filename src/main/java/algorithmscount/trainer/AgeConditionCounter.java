package algorithmscount.trainer;

import java.util.List;

public class AgeConditionCounter {
    public int countElderly(List<Trainer> trainerList, int minAge) {
        int countElderly = 0;
        for (Trainer trainer : trainerList) {
            if (trainer.getAge() > minAge) {
                countElderly++;
            }
        }
        return countElderly;
    }
}
