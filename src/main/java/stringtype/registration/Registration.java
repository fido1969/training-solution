package stringtype.registration;

import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {

        UserValidator userValidator = new UserValidator();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please give your username!");
        System.out.println(userValidator.isValidUsername(scanner.nextLine()) ? "Correct!" : "Not correct!");

        System.out.print("Please give your password!");
        String password1 = scanner.nextLine();

        System.out.print("Please give your password again!");
        String password2 = scanner.nextLine();

        System.out.println(userValidator.isValidPassword(password1, password2) ? "Correct!" : "Not correct!");

        System.out.print("Please give your email!");
        System.out.println(userValidator.isValidEmail("scanner.nextLine()") ? "Correct!" : "Not correct!");
    }
}
