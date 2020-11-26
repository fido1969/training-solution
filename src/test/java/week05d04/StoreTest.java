package week05d04;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StoreTest {

    @Test
    public void createConstructorTest() {
        Store store = new Store();
        store.addProduct(new Product("Milk", 2020, 11, 26));
        assertEquals(1, store.getProductList().size());
    }

    @Test
    public void containByNameTrueTest() {
        Store store = new Store();
        store.addProduct(new Product("Milk", 2020, 11, 26));
        assertEquals(true,store.containByName(new Product("Milk",2020,11,30)));
    }

    @Test
    public void containByNameFalseTest() {
        Store store = new Store();
        store.addProduct(new Product("Milk", 2020, 11, 26));
        assertEquals(false,store.containByName(new Product("Tea",2020,11,30)));
    }



    @Test
    public void createGetNumberOfExpiredExpiredTest() {
        Store store = new Store();
        store.addProduct(new Product("Milk", 2020, 11, 25));
        assertEquals(0, store.getNumberOfExpired());
    }

    @Test
    public void createGetNumberOfExpiredNotExpiredTest() {
        Store store = new Store();
        store.addProduct(new Product("Milk", 2020, 11, 29));
        assertEquals(0, store.getNumberOfExpired());
    }

    @Test
    public void createGetNumberOfExpiredNowTest() {
        Store store = new Store();
        store.addProduct(new Product("Milk", 2020, 11, 26));
        assertEquals(0, store.getNumberOfExpired());
    }

    @Test
    public void createGetNumberOfExpiredNowTest2() {
        List<Product> productList = new ArrayList<>();


        /*productList.add(new Product("Tea", 2020, 11, 01));
        Store store = new Store(productList);
        assertEquals(0, store.getNumberOfExpired());*/
    }


}
