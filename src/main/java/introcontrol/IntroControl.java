package introcontrol;

public class IntroControl {

    public int substractTenIfGreaterThanTen(int number) {
        if (number <= 10) {
            return number;
        } else {
            return number - 10;
        }
    }

    public String greetingToJoe(String name) {
        if (name == "Joe") {
            return "Hello Joe";
        } else {
            return "";
        }
    }

    public int calculateConsumption(int prev, int next) {
        if (prev <= next) {
            return next - prev;
        } else {
            return 9999 - prev + next;
        }
    }

    public void printNumbers(int max) {
        for (int i = 0; i <= max; i++) {
            System.out.println(i);
        }
    }

    public void printNumbersBetween(int min, int max) {
        for (int i = min + 1; i < max; i++) {
            System.out.println(i);
        }
    }

    public void printNumbersBetweenAnyDirection(int a, int b) {
        if (b > a) {
            for (int i = a + 1; i < b; i++) {
                System.out.println(i);
            }
        } else {
            for (int i = a - 1; i > b; i--) {
                System.out.println(i);
            }
        }
    }

    public void printOddNumbers(int max) {
            for (int i = 1; i <= max; i++) {
                if (i % 2 != 0) {
                    System.out.println(i);
                }
            }
    }
}
