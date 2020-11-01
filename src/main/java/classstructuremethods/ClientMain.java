package classstructuremethods;

public class ClientMain {
    public static void main(String[] args) {
        Client client = new Client();

        client.setName("Szabadkai János");
        client.setAddress("6000, Kecskemét Magyar utca 27.");
        client.setYear(1969);

        System.out.println("Name: " + client.getName());
        System.out.println("Address: " + client.getAddress());
        System.out.println("Birth of year: " + client.getYear());

        client.migrate("6000, Kecskemét Damjanich utca 1.");
        System.out.println("The change of address was successful!");
        System.out.println("The new address: " + client.getAddress());
    }
}
