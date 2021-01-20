package week06d02.senior;

import org.junit.jupiter.api.Test;
import week06d02.senior.Category;
import week06d02.senior.Product;
import week06d02.senior.Store;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StoreTest {

    @Test
    void getProductByCategoryName() {
        List<Product> products = new ArrayList<>();
        products.add(new Product("apple", Category.DAIRY,250));
        products.add(new Product("roll",Category.BAKEDGOODS,250));
        products.add(new Product("pulm",Category.DAIRY,250));
        products.add(new Product("soup",Category.OTHER,250));

        Store store = new Store(products);
        assertEquals(2, store.getProductByCategoryName(Category.DAIRY));
    }

    @Test
    void getProductByCategoryName1() {
        List<Product> products = new ArrayList<>();
        products.add(new Product("apple", Category.DAIRY, 250));
        assertEquals("apple", products.get(0).getName());
        assertEquals(250, products.get(0).getPrice());
        assertEquals(Category.DAIRY, products.get(0).getCategory());
    }

    @Test
    void getProductsByCategory() {
        List<Product> products = new ArrayList<>();
        products.add(new Product("apple",Category.DAIRY,250));
        products.add(new Product("roll",Category.BAKEDGOODS,250));
        products.add(new Product("pulm",Category.DAIRY,250));
        products.add(new Product("soup",Category.OTHER,250));

        Store store = new Store(products);
        assertEquals("[0 ; FROZEN    , 2 ; DAIRY    , 1 ; BAKEDGOODS    , 1 ; OTHER    ]", store.getProductsByCategory().toString());
    }
}