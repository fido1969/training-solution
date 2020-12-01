package week06d02;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class StoreTest {

    @Test
    public void getProductByCategoryNameTest() {

        Store store = new Store(Arrays.asList(

                new Product(Category.BAKEDGOODS, "roll", 35),
                new Product(Category.BAKEDGOODS, "bread", 175),
                new Product(Category.DAIRY, "milk", 235),
                new Product(Category.OTHER, "appel", 200),
                new Product(Category.OTHER, "orange", 300),
                new Product(Category.OTHER, "apricot", 550),
                new Product(Category.SWEET, "apricot", 550)
        ));
        assertEquals(2, store.getProductByCategoryName(Category.BAKEDGOODS));
        assertEquals(1, store.getProductByCategoryName(Category.DAIRY));
        assertEquals(3, store.getProductByCategoryName(Category.OTHER));
        assertEquals(1, store.getProductByCategoryName(Category.SWEET));
    }
}