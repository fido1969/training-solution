package introcontrol;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] array = new int[5];
        int j = 0;

        for (int i = 0; i < array.length; i++) {
            System.out.print("Give " + (i + 1) + " number: ");
            array[i] = scanner.nextInt();
        }

        for (int i = 0; i < array.length; i++) {
            j += array[i];
        }
        System.out.println("The sum of the given numbers: "+j);
    }
}
