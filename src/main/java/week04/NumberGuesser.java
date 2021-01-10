//Írj egy számkitaláló programot a GuessTheNumber osztályba! A program kitalál egy véletlenszerű számot
// 1 és100 között. Majd bekér a felhasználótól ciklusban számokat. Mindig megmondja, hogy a szám,
// kisebb, nagyobb vagy egyenlő-e mint a gondolt szám.!
package week04;

import java.util.Random;
import java.util.Scanner;

public class NumberGuesser {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = new Random(12).nextInt(100) + 1;
        System.out.println(number);

        System.out.println("Guess the number between 1 & 100!");
        System.out.println("---------------------------------");
        int tip = 0;
        int index=1;
        while (tip != number && index<7) {
            System.out.print("Give your tip: ");
            try {
                tip = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException nfr) {
                System.out.println("You gave not a number");
            }
            if (tip > number) {
                System.out.println("Your number larger!");
            }
            if (tip < number) {
                System.out.println("Your number smaller!");
            }
            if (tip == number) {
                System.out.println("Your tip is correct!");
            }
            index++;
        }
        if (tip!=number){
            System.out.println("you lost the game!");
        }
    }

   /* public static void main(String[] args) {
        int number = new Random(1).nextInt(100)+1;
        Scanner scanner = new Scanner(System.in);
        System.out.println(number);

        boolean ok = false;
        int guessed=0;
        while (!ok){
            System.out.print("Kérek egy számot [1..100] között: ");
            guessed=Integer.parseInt(scanner.nextLine());
            if (guessed>number){
                System.out.println("A gondolt szám kisebb!");
            }else if(guessed<number){
                System.out.println("A gondolt szám nagyobb!");
            }else {
                System.out.println("Talált!");
                ok=true;
            }
        }

    }*/
}
