package week05d04;

import java.time.LocalDate;
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

    public void addProduct(Product product) {
        this.productList.add(product);
    }

    /*public void addProductNotInListAndNotEpired(Product product) {
        for (Product productItem : productList){
            if (!(productItem.getName().equals(product)) && (productItem.getExpirationDay()!=product.getExpirationDay())){
                this.productList.add(product);
            }
        }
    }*/

    public List<Product> getProductList() {
        return productList;
    }

    public int getNumberOfExpired() {

        LocalDate now = LocalDate.now();
        int sum = 0;
        for (Product product : productList) {
            if (product.getExpirationDay().isBefore(now)) {
                sum += 1;
            }
        }
        return sum;
    }

    public static void main(String[] args) {

        Store store = new Store();

        store.addProduct(new Product("Milk", 2020, 11, 25));
        store.addProduct(new Product("Bread", 2020, 11, 27));
        store.addProduct(new Product("Butter", 2020, 11, 26));

        /*store.addProductNotInListAndNotEpired(new Product("Milk",2020,11,29));
        store.addProductNotInListAndNotEpired(new Product("Roll",2020,11,25));*/

        for (Product product : store.productList) {
            System.out.println(product.getName() + " : " + product.getExpirationDay());
        }

        System.out.println("The number of expired product: " + store.getNumberOfExpired());
    }
}
