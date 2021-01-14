package week06d02.senior;

import java.util.ArrayList;
import java.util.List;

public class Store {

    private List<Product> products;

    public Store(List<Product> products) {
        this.products = products;
    }

    public List<Product> getProducts() {
        return new ArrayList<>();
    }

    public void isNull(List<Product> list) {
        if (list == null || list.size() == 0) {
            throw new NullPointerException("Invalid list!");
        }
    }

    public int getProductByCategoryName(Category category) {
        isNull(products);
        int sumTypeOfCategory = 0;
        for (Product item : products) {
            if (item.getCategory() == category) {
                sumTypeOfCategory++;
            }
        }
        return sumTypeOfCategory;
    }

    public List<CategorySum> getProductsByCategory() {

        List<CategorySum> categorySum = new ArrayList<>();

        for (Category item : Category.values()) {
            int i = getProductByCategoryName(item);
            categorySum.add(new CategorySum(i, item));
        }
        return categorySum;
    }

}



