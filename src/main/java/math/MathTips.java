package math;

import java.util.Random;

public class MathTips {

    //Hogyan kerekítenél egy lebegőpontos számot pontosan 3 tizedes jegyre?
    public void mathRound0(double numberdouble) {
        String str = numberdouble + "";
        str = str.substring(0, str.indexOf(".")) + str.substring(str.indexOf("."), str.indexOf(".") + 4);
        System.out.println("Number_0: " + str);
    }

    //Hogyan kerekítenél egy lebegőpontos számot pontosan 3 tizedes jegyre?
    public void mathRound1(double numberdouble) {
        double result = Math.round(numberdouble * 1000) / 1000.0;
        System.out.println("Number_1: " + result);
    }

    public static void main(String[] args) {

        new MathTips().mathRound0(3.54689);
        System.out.println();
        new MathTips().mathRound1(3.54689);
        System.out.println();
        double numberdouble = 3.54689;

        //Hogyan kerekítenél egy lebegőpontos számot pontosan 3 tizedes jegyre?
        System.out.printf("Number_2: %.3f", numberdouble);
        System.out.println();
        System.out.println();

        //Hogyan generálnál -10 és 20 közötti egész véletlenszámot?
        int rnd = new Random().nextInt(30) - 10;
        System.out.println("RoundedNumber: "+rnd);
        System.out.println();

        //És -3 és 3 közötti lebegőpontosat?
        double rnd1 = (int)((new Random().nextDouble() *6) - 3);
        System.out.println("RoundedNumber: "+rnd1);

    }

}
