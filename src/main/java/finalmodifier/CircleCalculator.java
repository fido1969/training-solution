package finalmodifier;

public class CircleCalculator {

    public static final double PI = 3.14;

    public double calculatePerimeter(double r) {
        return 2 * r * PI;
    }

    public double calculateArea(double r) {
        return Math.pow(r, 2) * PI;
    }

    public static void main(String[] args) {

        System.out.println("The perimeter of the circle: " + new CircleCalculator().calculatePerimeter(2));
        System.out.println("The area of the circle: " + new CircleCalculator().calculateArea(2));
    }
}
