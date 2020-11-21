package attributes.bill;

import java.util.ArrayList;
import java.util.List;

public class BillMain {

    public static void main(String[] args) {

        Bill bill = new Bill();

        bill.addItem(new Item("hammer", 5, 10000));
        bill.addItem(new Item("gear", 50, 30000));
        bill.addItem(new Item("motor", 10, 70000));

        //A Bill osztályban a calculateTotalPrice() metódus végigmegy a számla
        //tételein, beszorozza a quantity és price értékeket, és összeadja őket!
        bill.calculateTotalPrice();
    }
}
