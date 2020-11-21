package attributes.bill;

import java.util.ArrayList;
import java.util.List;

public class Bill {

    private List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public List<Item> getItems() {
        return items;
    }

    public void calculateTotalPrice() {
        double sum = 0;
        for (int i = 0; i < items.size(); i++) {
            sum += items.get(i).getPrice() * items.get(i).getQuantity();
        }
        System.out.println(sum);
    }
}
