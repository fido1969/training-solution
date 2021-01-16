package methodparam;

public class Measurement {

    private double[] numbers;

    public Measurement(double[] numbers) {
        isEmpty(numbers);
        this.numbers = numbers;
    }

    public int findFirstIndexInLimit(int lower, int upper) {

        for (int i = 0; i < numbers.length; i++) {
            if ((numbers[i] > lower) && (numbers[i] < upper)) {
                return i;
            }
        }
        return -1;
    }

    public double minimum() {

        double min = Double.MAX_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        return min;
    }

    public double maximum() {

        double max = Double.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }

    public ExtremValues minmax() {
        return new ExtremValues(minimum(), maximum());
    }

    private void isEmpty(double[] numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Invalid array!");
        }
    }

}
