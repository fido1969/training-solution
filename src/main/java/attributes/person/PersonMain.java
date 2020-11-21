package attributes.person;

public class PersonMain {

    public static void main(String[] args) {

        //PersonMain personMain = new PersonMain();

        Person person = new Person("Szabadkai János", "IC:123456");
        System.out.println(person.personToString());

        Address address = new Address("Magyarország: ", "Kecskemét: ", "Damjanich utca 1: ", "6000");
        person.moveTo(address);
        System.out.println(person.getAddress().addressToString());
        System.out.println();

        person.correctData("Kiss Gábor", "IC:789446");
        System.out.println(person.personToString());

        person.getAddress().correctData("Magyarország: ", "Kecskemét: ", "Magyar utca 27, 2.emelet: ", "6000");
        System.out.println(person.getAddress().addressToString());
        System.out.println();

        person.correctData("Nagy Lajos", "IC:456213");
        person.getAddress().correctData("Hungary","Kecskemét","Mária utca 23","6000");

        System.out.print(person.getName()+": ");
        System.out.print(person.getIdentificationCard()+": ");
        System.out.print(person.getAddress().getCountry()+": ");
        System.out.print(person.getAddress().getCity()+": ");
        System.out.print(person.getAddress().getStreetAndNumber()+": ");
        System.out.print(person.getAddress().getZipCode());


    }
}
