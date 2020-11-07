package array;

import java.util.Scanner;

public class ArrayMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] dayOfTheWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sanday"};
        System.out.println("The 2.item of the array: " + dayOfTheWeek[1]);
        System.out.println("The length of the array: " + dayOfTheWeek.length);
        System.out.println();

        int[] powerFunctionOfTwo = new int[5];
        for (int i = 0; i < powerFunctionOfTwo.length; i++) {
            powerFunctionOfTwo[i] = (int) Math.pow(2, i);
        }

        for (int i = 0; i < powerFunctionOfTwo.length; i++) {
            System.out.print(powerFunctionOfTwo[i] + " ");
        }
        System.out.println();

        /*boolean[] arrayOfBoolean = new boolean[6];
        for (int i = 0; i < arrayOfBoolean.length; i++) {
            System.out.print(i + ".index: ");
            arrayOfBoolean[i] = scanner.nextBoolean();
        }*/

        boolean[] arrayOfBoolean = new boolean[6];
        for (int i = 1; i < arrayOfBoolean.length; i++) {
            arrayOfBoolean[i] = !arrayOfBoolean[i-1];
        }

        System.out.println();
        System.out.println("The items of the array:");

        for (int i = 0; i < arrayOfBoolean.length; i++) {
            System.out.println(i + ".index " + arrayOfBoolean[i]);
        }
    }
}
