package statements;

import java.util.Scanner;

public class InvestmentMain {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Befektetés összege:");
        int investing = scanner.nextInt();
        System.out.println("Kamatláb:");
        int interestRate = scanner.nextInt();

        Investment investment = new Investment(investing, interestRate);

        System.out.println("Tőke: " + investment.getFund());
        System.out.println("Hozam 50 napra: " + investment.getYield(50));
        System.out.println("Hozam 300 napra: " + investment.getYield(300));
        System.out.println("Kivett összeg 180 nap után: " + investment.close(180));
        System.out.println("Kivett összeg 181 nap után: " + investment.close(181));

    }

}
