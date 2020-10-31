package classstructureattributes;

import java.util.Scanner;

public class ClientMain {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        Client clientOne=new Client();
        System.out.println("Name: ");
        clientOne.name=scanner.nextLine();

        System.out.println("Birth of year: ");
        clientOne.year=scanner.nextInt();
        scanner.nextLine();

        System.out.println("Address: ");
        clientOne.address=scanner.nextLine();

        System.out.println("The Client name: "+clientOne.name);
        System.out.println("The Client birth of year: "+clientOne.year);
        System.out.println("The Client address: "+clientOne.address);
    }
}
