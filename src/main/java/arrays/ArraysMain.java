package arrays;

import java.util.Arrays;
import java.util.List;

public class ArraysMain {
    public static void main(String[] args) {

        ArraysMain arraysMain = new ArraysMain();

        System.out.println(arraysMain.numberOfDaysAsString() + " ");
        System.out.println();

        System.out.println(arraysMain.daysOfWeek());
        System.out.println();

        System.out.println(arraysMain.multiplicationTableAsString(4));
        System.out.println();

        System.out.println(arraysMain.sameTempValues(new double[]{21, 22, 23}, new double[]{21, 22, 23}));
        System.out.println(arraysMain.sameTempValues(new double[]{21, 22, 23}, new double[]{20, 22, 23}));
        System.out.println();

        int[] lotteryTips = new int[]{45, 7, 27, 77, 50};
        int[] lotteryNumbers = new int[]{45, 77, 27, 7, 50};
        arraysMain.printArrayOfArrays(lotteryTips);
        System.out.println();
        arraysMain.printArrayOfArrays(lotteryNumbers);
        System.out.println();

        System.out.println(arraysMain.wonLotterySort(lotteryTips,lotteryNumbers));

        arraysMain.printArrayOfArrays(lotteryTips);
        System.out.println();
        arraysMain.printArrayOfArrays(lotteryNumbers);
        System.out.println();
        System.out.println();
        System.out.println(arraysMain.wonLotterySort(new int[]{45, 7, 18, 77, 50}, new int[]{7, 27, 45, 77, 50}));

    }

    public String numberOfDaysAsString() {
        int[] numberOfDays = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        return Arrays.toString(numberOfDays);
    }

    public List<String> daysOfWeek() {
        String[] daysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sanday"};
        return Arrays.asList(daysOfWeek);
    }

    //copy from arrayofarrays.ArrayOfArraysMain. multiplicationTable()
    public String multiplicationTableAsString(int size) {
        int[][] multiplicationArray = new int[size][size];
        for (int i = 0; i < multiplicationArray.length; i++) {
            for (int j = 0; j < multiplicationArray[i].length; j++) {
                multiplicationArray[i][j] = (i + 1) * (j + 1);
            }
        }
        return Arrays.deepToString(multiplicationArray);
    }

    public boolean sameTempValues(double[] day, double[] anotherDay) {
        return Arrays.equals(day, anotherDay);
    }

    public boolean wonLotterySort(int[] lotteryTips, int[] lotteryNumbers) {
        Arrays.sort(lotteryTips);
        Arrays.sort(lotteryNumbers);
        return Arrays.equals(lotteryTips, lotteryNumbers);
    }

    //copy from arrayofarrays.ArrayOfArraysMain. printArrayOfArrays()
    public void printArrayOfArrays(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }


}
