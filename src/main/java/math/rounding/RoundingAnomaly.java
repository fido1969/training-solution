package math.rounding;

import java.util.Random;

public class RoundingAnomaly {

    public double[] randomNumbers(int size, double max, int scale) {
        double[] numbersDouble = new double[size];
        Random random = new Random();
        double rounding = Math.pow(10, scale);
        for (int i = 0; i < numbersDouble.length; i++) {
            numbersDouble[i] = Math.round(random.nextDouble() * max * rounding) / rounding;
        }
        return numbersDouble;
    }

    public double roundAfterSum(double[] numbers) {
        double adding = 0;
        for (int i = 0; i < numbers.length; i++) {
            adding += numbers[i];
        }
        return Math.round(adding);
    }

    public double sumAfterRound(double[] numbers) {
        double adding = 0;
        for (int i = 0; i < numbers.length; i++) {
            adding += Math.round(numbers[i]);
        }
        return adding;
    }

    public double difference(int size, double max, int scale) {
        double[] numbersDouble = randomNumbers(size, max, scale);
        //Why Math.abs() is needed?
        return Math.abs(roundAfterSum(numbersDouble) - sumAfterRound(numbersDouble));
    }

    public static void main(String[] args) {
        int counter = 100;
        double differenceSum = 0;
        for (int i = 0; i < counter; i++) {
           double difference = new RoundingAnomaly().difference(1000, 1000000, 5);
            //Why difference is printed?
            System.out.println("Difference: "+difference);
            differenceSum+=difference;
        }
        System.out.println(differenceSum / counter);
    }
}
