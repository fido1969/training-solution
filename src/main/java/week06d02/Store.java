package week06d02;

import java.util.ArrayList;
import java.util.List;

public class Store {
    //Készíts egy Store osztályt benne egy Product listával,
    //amit konstruktorban kap meg. Legyen egy getProductByCategoryName(Category),
    //ami visszaadja, hogy a paraméterül kapott kategóriából hány darab van a listában.

    private List<Product> productList;

    public Store(List<Product> productList) {
        this.productList = productList;
    }

    public List<Product> getProductList() {
        return new ArrayList<>();
    }

    public int getProductByCategoryName(Category categoryName) {
        int counter = 0;
        for (Product products : productList) {
            if (products.getCategory() == categoryName) {
                counter++;
            }
        }
        return counter;
    }
}
