package week04;

import java.util.Random;
import java.util.Scanner;

public class NumberGuesser {

    public static void main(String[] args) {
        int number = new Random().nextInt(100)+1;
        Scanner scanner = new Scanner(System.in);
        System.out.println(number);

        boolean ok = false;

        while (!ok){
            System.out.print("Kérek egy számot [1..100] között: ");
            int guessed=Integer.parseInt(scanner.nextLine());
            if (guessed>number){
                System.out.println("A gondolt szám kisebb!");
            }else if(guessed<number){
                System.out.println("A gondolt szám nagyobb!");
            }else {
                System.out.println("Talált!");
                ok=true;
            }
        }

    }
}
