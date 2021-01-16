package methodparam;

public class Measurement {

    private double[] measurement;

    public Measurement(double[] measurement) {
        isEmpty(measurement);
        this.measurement = measurement;
    }

    public int findFirstIndexInLimit(int lower, int upper) {

        for (int i = 0; i < measurement.length; i++) {
            if (measurement[i] > lower && measurement[i] < upper) {
                return i;
            }
        }
        return -1;
    }

    public double minimum() {

        double min = Double.MAX_VALUE;

        for (int i = 0; i < measurement.length; i++) {
            if (measurement[i] < min) {
                min = measurement[i];
            }
        }
        return min;
    }

    public double maximum() {

        double max = Double.MIN_VALUE;

        for (int i = 0; i < measurement.length; i++) {
            if (measurement[i] > max) {
                max = measurement[i];
            }
        }
        return max;
    }

    public ExtremValues minmax() {
        return new ExtremValues(minimum(), maximum());
    }

    private void isEmpty(double[] measurement) {
        if (measurement == null || measurement.length == 0) {
            throw new IllegalArgumentException("Invalid array!");
        }
    }

}
