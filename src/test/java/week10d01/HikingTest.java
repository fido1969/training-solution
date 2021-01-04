package week10d01;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HikingTest {

    @Test
    void getPlusElevationtest1() {
            assertEquals(13.0, Hiking.getPlusElevation(List.of(10.0, 20.0, 15.0, 18.0)), 0.0001);
            }

    @Test
    void getPlusElevationtest2() {
        assertEquals(0.0, Hiking.getPlusElevation(List.of(10.0)), 0.0001);
    }

    @Test
    void getPlusElevationtest3() {
        assertEquals(0.0, Hiking.getPlusElevation(List.of()), 0.0001);
    }

    @Test
    void getPlusElevationtest4() {
        assertThrows(IllegalArgumentException.class, () -> Hiking.getPlusElevation(null));
    }



}