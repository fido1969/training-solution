package week06d02;

public class Product {
    //Junior/Mid-level mai feladata: Hozz létre egy week06d02.Product osztályt melynek adattagjai
    // a név, kategória és ár,rendre, String, String int.

    private Category category;
    private String name;
    private int price;

    public Product(Category category, String name, int price) {
        this.category = category;
        this.name = name;
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
