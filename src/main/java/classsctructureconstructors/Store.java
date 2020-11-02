package classsctructureconstructors;

public class Store {

    private String product;
    private int stock;

    public Store(String product) {
        this.product = product;
        stock = 0;
    }

    public String getProduct() {
        return product;
    }

    public int getStock() {
        return stock;
    }

    public void store(int store) {
        this.stock += store;
    }

    public void dispatch(int dispatch) {
        this.stock -= dispatch;
    }
}
