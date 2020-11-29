package algorithmsmax.trainer;

import java.util.List;

public class MaxAgeCalculator {

    public Trainer trainerWithMaxAge(List<Trainer> trainerList) {

        Trainer trainerWithMaxAge = null;
        for (Trainer trainer : trainerList) {
            if (trainerWithMaxAge == null || trainer.getAge() > trainerWithMaxAge.getAge()) {
                trainerWithMaxAge = trainer;
            }
        }
        return trainerWithMaxAge;
    }
}
