package methodvarargs.examstats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExamStatsTest {

       ExamStats examStats = new ExamStats(60);

    @Test
    void getNumberOfTopGrades() {
        assertEquals(3, examStats.getNumberOfTopGrades(80, 20, 50, 56, 30, 60));
        assertEquals(5, examStats.getNumberOfTopGrades(50, 31, 50, 56, 40, 60));
    }

    @Test
    void hasAnyFailed() {
        assertEquals(true,examStats.hasAnyFailed(50, 20, 50, 55, 56, 30, 60));
        assertEquals(false,examStats.hasAnyFailed(80, 50, 50, 55, 56, 30, 60));
    }

    @Test
    void hasAnyFailedEmpty() {
        IllegalArgumentException iae= assertThrows(IllegalArgumentException.class,()->examStats.hasAnyFailed(50));
        assertEquals("No paramaeters were given!",iae.getMessage());
    }

    @Test
    void hasAnyFailedNull() {
        IllegalArgumentException iae= assertThrows(IllegalArgumentException.class,()->examStats.hasAnyFailed(50,null));
        assertEquals("No paramaeters were given!",iae.getMessage());
    }

    @Test
    void getNumberOfTopGradesEmpty() {
        IllegalArgumentException iae= assertThrows(IllegalArgumentException.class,()->examStats.hasAnyFailed(50));
        assertEquals("No paramaeters were given!",iae.getMessage());
    }

    @Test
    void getNumberOfTopGradesNull() {
        IllegalArgumentException iae= assertThrows(IllegalArgumentException.class,()->examStats.hasAnyFailed(50,null));
        assertEquals("No paramaeters were given!",iae.getMessage());
    }
}