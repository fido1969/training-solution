package finalmodifier;

public class PiMain {

    public static void main(String[] args) {

        System.out.println("The value of PI: " + CircleCalculator.PI);
        System.out.println();
        System.out.println("The perimeter of the circle: " + new CircleCalculator().calculatePerimeter(2));
        System.out.println();
        System.out.println("The area of the circle: " + new CircleCalculator().calculateArea(2));
        System.out.println();
        System.out.println("The surfaceArea of cylinder: " + new CylinderCalculator().calculateSurfaceArea(2, 2));
        System.out.println();
        System.out.println("The volume of the cylinder: " + new CylinderCalculator().calculateVolume(2, 2));
        System.out.println();
        System.out.println("The surfaceArea of cylinder: " + new CylinderCalculatorBasedOnCircle().calculateSurfaceArea(2, 2));
        System.out.println();
        System.out.println("The volume of the cylinder: " + new CylinderCalculatorBasedOnCircle().calculateVolume(2, 2));

    }
}
