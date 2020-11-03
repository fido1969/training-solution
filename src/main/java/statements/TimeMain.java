package statements;

import java.util.Scanner;

public class TimeMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("1.hour:");
        int hour1 = scanner.nextInt();
        System.out.println("1.minute:");
        int minute1 = scanner.nextInt();
        System.out.println("1.second:");
        int second1 = scanner.nextInt();

        System.out.println("2.hour:");
        int hour2 = scanner.nextInt();
        System.out.println("2.minute:");
        int minute2 = scanner.nextInt();
        System.out.println("2.second:");
        int second2 = scanner.nextInt();

        Time time1 = new Time(hour1, minute1, second1);
        Time time2 = new Time(hour2, minute2, second2);

        System.out.println("The first time " + time1.toString() + " = " + time1.getInMinute());
        System.out.println("The second time " + time2.toString() + " = " + time2.getInSecond());
        System.out.println("The first time earlier than the second time:" + time1.earlierThan(time2));
    }
}
