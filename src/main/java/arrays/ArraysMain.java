package arrays;

import java.util.Arrays;
import java.util.List;

public class ArraysMain {
    public static void main(String[] args) {

        ArraysMain arraysMain = new ArraysMain();

        System.out.print(arraysMain.numberOfDaysAsString() + " ");
        System.out.println();
        System.out.println();
        System.out.println(arraysMain.daysOfWeek());

    }

    public String numberOfDaysAsString() {

        int[] numberOfDays = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        return Arrays.toString(numberOfDays);
    }

    public List<String> daysOfWeek() {

        String[] daysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sanday"};

        return Arrays.asList(daysOfWeek);
    }



}
