package week06d01;

public class SumResult {

    private final double positive;
    private final double negarive;

    public SumResult(double positive, double negarive) {
        this.positive = positive;
        this.negarive = negarive;
    }

    public double getPositive() {
        return positive;
    }

    public double getNegarive() {
        return negarive;
    }

    @Override
    public String toString() {
        return "SumResult{" +
                "positive=" + positive +
                ", negarive=" + negarive +
                '}';
    }
}
