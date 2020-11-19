package finalmodifier;

import java.util.Arrays;
import java.util.List;

public class Week {

    public static final List<String> DAY_OF_THE_WEEK = Arrays.asList("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday");


    public static void main(String[] args) {
        System.out.println(DAY_OF_THE_WEEK);
        DAY_OF_THE_WEEK.set(1, "Wednesday");
        System.out.println(DAY_OF_THE_WEEK);
    }

}
