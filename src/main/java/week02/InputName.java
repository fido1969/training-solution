package week02;

import java.util.Scanner;

public class InputName {
    public static void main(String[] args) {

        String[] nevsor = new String[5];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < nevsor.length; i++) {
            System.out.println("Add meg az " + i + " elemet : ");
            nevsor[i] = scanner.nextLine();
        }
        for (int i = 0; i < nevsor.length; i++) {
            System.out.println((i + 1) + " elem: " + nevsor[i]);
        }

    }
}
