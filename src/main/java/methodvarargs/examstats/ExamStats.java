package methodvarargs.examstats;

public class ExamStats {

    private final int maxPoints;

    public ExamStats(int maxPoints) {
        this.maxPoints = maxPoints;
    }

    public int getNumberOfTopGrades(int limitInPercent, int... results) {
        isEmpty(results);
        int numberOfTopGrades = 0;
        for (int result : results) {
            if (maxPoints * limitInPercent / 100 < result) {
                numberOfTopGrades++;
            }
        }
        return numberOfTopGrades;
    }

    public boolean hasAnyFailed(int limitInPercent, int... results) {
        isEmpty(results);
        for (int result : results) {
            return (result < maxPoints * limitInPercent / 100);
        }
        return false;
    }

    private void isEmpty(int[] results) {
        if (results == null || results.length == 0) {
            throw new IllegalArgumentException("No paramaeters were given!");
        }
    }
}
