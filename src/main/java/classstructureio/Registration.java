package classstructureio;

import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please fill in your registration form!");

        System.out.println("Please enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Please enter your email address: ");
        String emailAddress = scanner.nextLine();

        System.out.println("The registration was successful!");
        System.out.println("Your registered name: " + name);
        System.out.println("Your registered email address: " + emailAddress);
    }

}
