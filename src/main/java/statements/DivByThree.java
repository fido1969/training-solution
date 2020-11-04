package statements;

import java.util.Scanner;

public class DivByThree {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Give an integer number:");

        int number = scanner.nextInt();

        System.out.println(number % 3 == 0 ? "dividable" : "not dividable");

    }
}
