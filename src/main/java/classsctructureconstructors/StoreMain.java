package classsctructureconstructors;

public class StoreMain {
    public static void main(String[] args) {
        Store storeApple = new Store("Apple");
        Store storeOrange = new Store("Orange");

        System.out.println("The stored product: " + storeOrange.getProduct());
        System.out.println("Orange WH contains " + storeOrange.getStock() + " kg.");
        storeOrange.store(500);
        System.out.println("Orange WH contains " + storeOrange.getStock() + " kg.");
        storeOrange.dispatch(300);
        System.out.println("Orange WH contains " + storeOrange.getStock() + " kg.");

        System.out.println();

        System.out.println("The stored product: " + storeApple.getProduct());
        System.out.println("Apple WH contains " + storeApple.getStock() + " kg.");
        storeApple.store(1750);
        System.out.println("Apple WH contains " + storeApple.getStock() + " kg.");
        storeApple.dispatch(750);
        System.out.println("Apple WH contains " + storeApple.getStock() + " kg.");
    }
}
