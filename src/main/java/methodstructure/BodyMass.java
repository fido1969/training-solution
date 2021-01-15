package methodstructure;

public class BodyMass {

    public static double LOWER_LIMIT = 18.5;
    public static double UPPER_LIMIT = 25.0;

    private double weight;
    private double height;

    public BodyMass(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public double bodyMassIndex() {
        double bmi = (weight / Math.pow(height, 2))*100;
        return Math.round(bmi)/100.0;
    }

    public BmiCategory body() {
        if (bodyMassIndex() < LOWER_LIMIT) {
            return BmiCategory.UNDERWEIGHT;
        } else if (bodyMassIndex() > UPPER_LIMIT) {
            return BmiCategory.OVERWEIGHT;
        }
        return BmiCategory.NORMAL;
    }

    boolean isThinnerThan(BodyMass bmiOther) {
        return this.bodyMassIndex() < bmiOther.bodyMassIndex();
    }
}
