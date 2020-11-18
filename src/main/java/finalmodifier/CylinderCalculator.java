package finalmodifier;

import static finalmodifier.CircleCalculator.PI;

public class CylinderCalculator {

    public double calculateVolume(double r, double h) {
        return Math.pow(r, 2) * PI * h;
    }

    public double calculateSurfaceArea(double r, double h) {
        return (2 * Math.pow(r, 2) * CircleCalculator.PI) + (2 * r * CircleCalculator.PI * h);
    }

}
