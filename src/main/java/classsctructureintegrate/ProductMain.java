package classsctructureintegrate;

import java.util.Scanner;

public class ProductMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Give the name of the product: ");
        String name = scanner.nextLine();

        System.out.print("Give the price: ");
        int price = scanner.nextInt();
        System.out.println();

        Product product = new Product(name, price);
        System.out.println(product.getName()+" price: " + product.getPrice()+" HUF");
        product.increasePrice(10000);
        System.out.println(product.getName()+" price: "+ product.getPrice()+" HUF");
        product.decreasePrice(10000);
        System.out.println(product.getName()+" price: " + product.getPrice()+" HUF");
    }
}
