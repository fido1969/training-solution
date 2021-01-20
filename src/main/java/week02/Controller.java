package week02;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Controller {

    private Office office;

    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.readOffice();
        controller.printMenu();
        controller.runMenu();
    }

    public void readOffice() {
        office = new Office();
        Scanner scanner = new Scanner(System.in);
        String nameNew;
        int lengthNew;
        int widthNew;

        System.out.print("Give the number of the meeting rooms: ");
        int number = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= number; i++) {

            System.out.print(i + ". Office name: ");
            nameNew = scanner.nextLine();

            System.out.print(i + ". Office length: ");
            lengthNew = scanner.nextInt();

            System.out.print(i + ". Office width: ");
            widthNew = scanner.nextInt();
            scanner.nextLine();
            MeetingRoom roomNew = new MeetingRoom(nameNew, lengthNew, widthNew);
            office.addMeetingRoom(roomNew);

        }
        System.out.println();
    }

    public void printMenu() {
        System.out.println("              MENU");
        System.out.println("1. Meeting rooms in order");
        System.out.println("2. Meeting rooms in reverse order");
        System.out.println("3. Every second meeting room");
        System.out.println("4. Areas");
        System.out.println("5. Search by exact name");
        System.out.println("6. Search by name fragment");
        System.out.println("7. Search by area");
        System.out.println();
    }

    public void runMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Choose a number from the MENU: ");
        int numberOfMenu = scanner.nextInt();
        scanner.nextLine();

        switch (numberOfMenu) {
            case 1:
                office.printNames();
                break;
            case 2:
                office.printNamesReverse();
                break;
            case 3:
                office.printEvenNames();
                break;
            case 4:
                office.printAreas();
                break;
            case 5:
                System.out.print("Office exact name: ");
                String nameNew = scanner.nextLine();
                office.printMeeetingRoomsWithName(nameNew);
                break;
            case 6:
                System.out.print("Office name fragment: ");
                nameNew = scanner.nextLine();
                office.printMeetingRoomsContains(nameNew);
                break;
            case 7:
                System.out.print("Office minimum area: ");
                int area = scanner.nextInt();
                scanner.nextLine();
                office.printAreasLargerThan(area);
                break;
            default:
                throw new IllegalArgumentException();
        }
    }

}

