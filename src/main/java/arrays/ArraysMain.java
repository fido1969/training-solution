package arrays;

import java.util.Arrays;

public class ArraysMain {
    public static void main(String[] args) {

        ArraysMain arraysMain = new ArraysMain();

        System.out.print(arraysMain.numberOfDaysAsString() + " ");

    }

    public String numberOfDaysAsString() {

        int[] numberOfDays = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        return Arrays.toString(numberOfDays);
    }
}
