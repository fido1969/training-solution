package numbers;

import java.util.Scanner;

public class CircleMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Első kör átmérője:");
        Circle circle1 = new Circle(scanner.nextInt());

        System.out.println("Második kör átmérője:");
        Circle circle2 = new Circle(scanner.nextInt());

        System.out.println("1. kör kerülete: " + circle1.perimeter());
        System.out.println("1. kör területe: " + circle1.area());
        System.out.println("2. kör kerülete: " + circle2.perimeter());
        System.out.println("2. kör területe: " + circle2.area());
    }
}
