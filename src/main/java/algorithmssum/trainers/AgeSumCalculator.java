package algorithmssum.trainers;

import java.util.List;

public class AgeSumCalculator {

    public int sumAges(List<Trainer> trainerList) {
        int sum = 0;
        for (Trainer trainer : trainerList) {
            sum += trainer.getAge();
        }
        return sum;
    }
}
