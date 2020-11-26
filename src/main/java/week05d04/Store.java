package week05d04;

import java.util.ArrayList;
import java.util.List;

public class Store {
    //Legyen benne egy getNumberOfExpired() metódus ami visszaadja a lejárt termékek számát. Használd a LocalDate.now() és az isBefore() metódusokat.
    // LocalDate a = LocalDate.of(2012, 6, 30);
    //   LocalDate b = LocalDate.of(2012, 7, 1);
    //   a.isBefore(b) == true
    //   a.isBefore(a) == false
    //   b.isBefore(a) == false

    private List<Product> productList = new ArrayList<>();

    public List<Product> getProductList() {
        return productList;
    }

    public boolean containByName(Product product) {
        for (Product productItem : productList) {
            if (productItem.getName().equals(product.getName())) {
                return true;
            }
        }
        return false;
    }

    public boolean isValid(Product product) {
        if (containByName(product) || product.isExpired()) {
            return false;
        }
        return true;
    }

    public boolean addProduct(Product product) {
        if (!isValid(product)) {
            return false;
        }
        productList.add(product);
        return true;
    }

    public int getNumberOfExpired() {
        int sum = 0;
        for (Product product : productList) {
            if (product.isExpired()) {
                sum += 1;
            }
        }
        return sum;
    }

    public static void main(String[] args) {

        Store store = new Store();
        store.productList.add(new Product("Milk", 2020, 11, 25));
        store.productList.add(new Product("Tea", 2020, 11, 11));

        store.addProduct(new Product("Milk", 2020, 11, 29));
        store.addProduct(new Product("Bread", 2020, 11, 27));
        store.addProduct(new Product("Butter", 2020, 11, 26));
        store.addProduct(new Product("Butter",2020,11,28));
        store.addProduct(new Product("Tea",2020,12,20));
        store.addProduct(new Product("Sugar",2020,10,20));

        for (Product product : store.productList) {
            System.out.println(product.getName() + " : " + product.getExpirationDay());
        }
        System.out.println("The number of expired product: " + store.getNumberOfExpired());
    }

}
