package introcontrol;

import java.util.Scanner;

public class Qualifier {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number: ");
        int number =scanner.nextInt();

        if (number > 100) {
            System.out.println("The given number is larger than 100!");
        } else if (number == 100) {
            System.out.println("The given number is 100!");
        } else {
            System.out.println("The given number is smaller than 100!");
        }
    }
}
