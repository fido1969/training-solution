package week07d03.senior;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DateTest {

    Date date = new Date(2021, 01, 17);

    @Test
    void test() {
        assertEquals(2021, date.getYear());
        assertEquals(01, date.getMonth());
        assertEquals(17, date.getDay());
        System.out.println(date.toString());
    }

    @Test
    void of() {
        Date newDate = Date.of(2013, 13, 13);
        assertEquals(2013, newDate.getYear());
        assertEquals(13, newDate.getMonth());
        assertEquals(13, newDate.getDay());
        System.out.println(newDate.toString());
    }

    @Test
    void withYear() {
        Date withYear = date.withYear(2019);
        assertEquals(2019, withYear.getYear());
        assertEquals(01, withYear.getMonth());
        assertEquals(17, withYear.getDay());
        System.out.println(withYear.toString());
    }

    @Test
    void withMonth() {
        Date withMonth = date.withMonth(12);
        assertEquals(2021, withMonth.getYear());
        assertEquals(12, withMonth.getMonth());
        assertEquals(17, withMonth.getDay());
        System.out.println(withMonth.toString());
    }

    @Test
    void withDay() {
        Date withDay = date.withDay(30);
        assertEquals(2021, withDay.getYear());
        assertEquals(01, withDay.getMonth());
        assertEquals(30, withDay.getDay());
        System.out.println(withDay.toString());
    }
}