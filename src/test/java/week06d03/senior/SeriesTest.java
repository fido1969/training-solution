package week06d03.senior;

import org.junit.jupiter.api.Test;
import week06d03.senior.Series;
import week06d03.senior.SeriesType;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SeriesTest {

    @Test
    public void testSeriesAsc() {
        Series s = new Series();
        assertEquals(SeriesType.ASCENDING, s.calculateSeriesType(Arrays.asList(1, 2, 3, 4, 5, 6)));
    }

    @Test
    public void testSeriesDesc() {
        Series s = new Series();
        assertEquals(SeriesType.DESCENDING, s.calculateSeriesType(Arrays.asList(6, 5, 4, 3, 2, 1)));
    }

    @Test
    public void testSeriesOther() {
        Series s = new Series();
        assertEquals(SeriesType.OTHER, s.calculateSeriesType(Arrays.asList(6, 7, 4, 3, 8, 1)));
    }

    @Test
    public void testSeriesToSmall() {
        Series s = new Series();
        Exception ex = assertThrows(IllegalArgumentException.class, () -> s.calculateSeriesType(Arrays.asList(1)));
        assertEquals("Invalis list!", ex.getMessage());
    }

    @Test
    public void testSeriesEmpty() {
        Series s = new Series();
        Exception ex = assertThrows(IllegalArgumentException.class, () -> s.calculateSeriesType(null));
        assertEquals("Invalis list!", ex.getMessage());
    }


}