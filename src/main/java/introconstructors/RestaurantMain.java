package introconstructors;

import java.util.ArrayList;
import java.util.List;
import static introconstructors.Restaurant.SEAT;

public class RestaurantMain {

    public static void main(String[] args) {

        Restaurant restaurant= new Restaurant("Falótanya",4);

        System.out.println("Name of the restaurant: "+restaurant.getName());
        System.out.println("Capacity of the restaurant: "+restaurant.getCapacity()+" places");
        System.out.println("The Menu: "+restaurant.getMenu());
    }
}
