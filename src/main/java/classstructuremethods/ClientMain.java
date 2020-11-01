package classstructuremethods;

public class ClientMain {
    public static void main(String[] args) {
        Client client=new Client();

        client.setName("Szabadkai János");
        client.setAddress("6000, Kecskemét Magyar utca 27.");
        client.setYear(1969);

        System.out.println(client.getName());
        System.out.println(client.getAddress());
        System.out.println(client.getYear());

        System.out.println("The address was changed successfilly!");
        client.migrate("6000, Kecskemét Damjanich utca 1.");
        System.out.println("Your new address: "+client.getAddress());
    }
}
