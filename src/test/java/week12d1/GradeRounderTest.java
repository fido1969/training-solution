package week12d1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GradeRounderTest {

    @Test
    void roundGradesTest() {
        GradeRounder gradeRounder = new GradeRounder();
        int[] test = gradeRounder.roundGrades(new int[]{34, 52, 84, 98, 65, 48, 100});
        assertEquals(34, test[0]);
        assertEquals(52, test[1]);
        assertEquals(85, test[2]);
        assertEquals(100, test[3]);
        assertEquals(65, test[4]);
        assertEquals(50, test[5]);
        assertEquals(100, test[6]);
    }

    @Test
    void roundGradesError() {
        GradeRounder gradeRounder = new GradeRounder();
        assertThrows(IllegalArgumentException.class, () -> gradeRounder.roundGrades(new int[]{-10}));
        assertThrows(IllegalArgumentException.class, () -> gradeRounder.roundGrades(new int[]{101}));
    }

    @Test
    void roundGradesTest1() {
        GradeRounder gradeRounder = new GradeRounder();
        int[] test = gradeRounder.roundGrades(new int[]{34, 52, 84, 98, 65, 48, 100});
        assertEquals(34, test[0]);
        assertEquals(52, test[1]);
        assertEquals(85, test[2]);
        assertEquals(100, test[3]);
        assertEquals(65, test[4]);
        assertEquals(50, test[5]);
        assertEquals(100, test[6]);
    }

    @Test
    void roundGradesError1() {
        GradeRounder gradeRounder = new GradeRounder();
        assertThrows(IllegalArgumentException.class, () -> gradeRounder.roundGrades(new int[]{-10}));
        assertThrows(IllegalArgumentException.class, () -> gradeRounder.roundGrades(new int[]{101}));
    }
}