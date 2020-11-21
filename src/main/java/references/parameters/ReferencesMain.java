package references.parameters;

import java.security.spec.RSAOtherPrimeInfo;

public class ReferencesMain {

    public static void main(String[] args) {

        Person person1 = new Person("John Doe", 25);

        Person person2 = new Person("Jack Doe", 55);

        person1 = new Person("Jimmy Hook", 65);

        person2 = person1;

        person2.setName("Ali Baba");

        System.out.println(person1);
        System.out.println(person1.getName() + "  " + person1.getAge());
        System.out.println(person2);
        System.out.println(person2.getName() + "  " + person2.getAge());

        int a = 24;
        int b = a;
        b++;
        System.out.println(a);
        System.out.println(b);

        person1 = new Person("Mohamed Ali", 29);

        System.out.println(person1);
        System.out.println(person1.getName() + "  " + person1.getAge());
        System.out.println(person2);
        System.out.println(person2.getName() + "  " + person2.getAge());

    }
}
