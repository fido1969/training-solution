package classstructureio;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the first integer number");
        int numberFirst = scanner.nextInt();

        System.out.println("Please enter the Second integer number");
        int numberSecond = scanner.nextInt();

        System.out.println(numberFirst + " + " + numberSecond);
        System.out.println(numberFirst + numberSecond);
    }
}
