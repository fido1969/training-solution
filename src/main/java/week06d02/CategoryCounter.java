package week06d02;

public class CategoryCounter {

    private Category category;
    private int counter;

    public CategoryCounter(Category category, int count) {
        this.category = category;
        this.counter = count;
    }

    public Category getCategory() {
        return category;
    }

    public int getCounter() {
        return counter;
    }
}
