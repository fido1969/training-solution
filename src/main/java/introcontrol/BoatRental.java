package introcontrol;

import java.util.Scanner;

public class BoatRental {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Give the number of the members: ");
        int numberOfMembers = scanner.nextInt();
        scanner.nextLine();

        int boatplaces5 = 5;
        int boatplaces3 = 3;
        int boatplaces2 = 2;

        int freeplaces = 10;
        int freeboats = 3;

        if (numberOfMembers > 3) {
            System.out.println("The boat with 5 places was taken");
            numberOfMembers = numberOfMembers - 5;
            freeplaces = freeplaces - 5;
            freeboats = freeboats - 1;
        }

        if (numberOfMembers > 2) {
            System.out.println("The boat with 3 places was taken");
            numberOfMembers = numberOfMembers - 3;
            freeplaces = freeplaces - 3;
            freeboats = freeboats - 1;
        }

        if (numberOfMembers > 0) {
            System.out.println("The boat with 2 places was taken");
            numberOfMembers = numberOfMembers - 2;
            freeplaces = freeplaces - 2;
            freeboats = freeboats - 1;
        }

        if (numberOfMembers > 0) {
            System.out.println("No place for everyone!");
        } else {
            System.out.println("Empty boats: "+freeboats);
            System.out.println("Empty places: "+freeplaces);
        }
    }
}
