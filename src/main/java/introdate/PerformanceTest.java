package introdate;

import java.time.LocalDate;
import java.time.LocalTime;

public class PerformanceTest {

    public static void main(String[] args) {

        Performance performance = new Performance("János", LocalDate.of(2020,11,07), LocalTime.of(18,00),LocalTime.of(20,30));

        System.out.println(performance.getInfo());

    }
}
