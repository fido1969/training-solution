package introcontrol;

public class IntroControlMain {

    public static void main(String[] args) {

        IntroControl introControl = new IntroControl();

        System.out.println(introControl.substractTenIfGreaterThanTen(5));
        System.out.println(introControl.substractTenIfGreaterThanTen(10));
        System.out.println(introControl.substractTenIfGreaterThanTen(22));

        System.out.println(introControl.greetingToJoe("Joe"));
        System.out.println(introControl.greetingToJoe("Jack"));
        System.out.println(introControl.greetingToJoe("Andreas"));

        //prev and next <= 9999
        System.out.println(introControl.calculateConsumption(56,156));
        System.out.println(introControl.calculateConsumption(9999,156));
        System.out.println(introControl.calculateConsumption(0,150));
        System.out.println(introControl.calculateConsumption(9800,9999));

        introControl.printNumbers(6);
        introControl.printNumbers(10);

        introControl.printNumbersBetween(0,5);
        introControl.printNumbersBetween(5,0);
        introControl.printNumbersBetween(15,19);

        introControl.printNumbersBetweenAnyDirection(5,10);
        introControl.printNumbersBetweenAnyDirection(15,10);

        introControl.printOddNumbers(7);
        introControl.printOddNumbers(6);
    }
}
