package classsctructureintegrate;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bank account number: ");
        String accountNumber1 = scanner.nextLine();
        System.out.print("Name of the owner: ");
        String owner1 = scanner.nextLine();
        System.out.print("Opening amount: ");
        int openingAmount1 = scanner.nextInt();
        scanner.nextLine();

        BankAccount bankAccount1 = new BankAccount(accountNumber1, owner1, openingAmount1);

        System.out.print("Bank account number: ");
        String accountNumber2 = scanner.nextLine();
        System.out.print("Name of the owner: ");
        String owner2 = scanner.nextLine();
        System.out.print("Opening amount: ");
        int openingAmount2 = scanner.nextInt();
        scanner.nextLine();

        BankAccount bankAccount2 = new BankAccount(accountNumber2, owner2, openingAmount2);

        System.out.println(bankAccount2.getInfo());
        System.out.println(bankAccount1.getInfo());

        System.out.print("What is the depositAmount to the bankAccount1: ");
        int depositAmount = scanner.nextInt();
        bankAccount1.deposit(depositAmount);
        System.out.println(bankAccount1.getInfo());

        System.out.print("What is the withdrawAmount from the bankAccount1: ");
        int withdrawAmount = scanner.nextInt();
        bankAccount1.withdraw(withdrawAmount);
        System.out.println(bankAccount1.getInfo());

        System.out.println();
        System.out.println();

        System.out.print("What is the transferAmount from the bankAccount1 to the bankAccount2: ");
        int transferAmount = scanner.nextInt();
        bankAccount1.transfer(bankAccount2, transferAmount);
        System.out.println(bankAccount2.getInfo());
        System.out.println(bankAccount1.getInfo());
    }
}
