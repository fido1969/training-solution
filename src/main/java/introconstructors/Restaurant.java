package introconstructors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Restaurant {
    public static final int SEAT=4;//capacity = numberOfTables * 4;
    private List<String> menu;
    private String name;
    private int capacity;

    public Restaurant(String name, int numberOfTables) {
        this.name = name;
        capacity = numberOfTables * SEAT;
        // capacity = numberOfTables * 4;
        menu=makeMenu();
    }

    public List<String> makeMenu() {
        List<String> menu = new ArrayList<>();
        menu.add("Pork");
        menu.add("Srhimps");
        menu.add("Beef");
        return menu;
        //return Arrays.asList("Pork", "Srhimps", "Beef");
    }

    public List<String> getMenu() {
        return menu;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }
}
