package week07d04;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class LabTest {

    @Test
    public void testConstructorTitle() {
        Lab lab = new Lab("Task");
        assertEquals("Task", lab.getTitle());
        assertEquals(null, lab.getCompletedAt());
        assertEquals(false, lab.isCompleted());
    }

    @Test
    public void testConstructorTitleWithDate() {
        Lab lab = new Lab("Task", LocalDate.of(2020, 12, 10));
        assertEquals("Task", lab.getTitle());
        assertEquals(LocalDate.of(2020, 12, 10), lab.getCompletedAt());
        assertEquals(true, lab.isCompleted());
    }

    @Test
    public void testCompleteWithDate(){
        Lab lab = new Lab("Task");
        lab.completeWithDate(LocalDate.of(2020,12,10));
        assertTrue(lab.isCompleted());
        assertEquals(LocalDate.of(2020,12,10),lab.getCompletedAt());
    }
    @Test
    public void testCompleteNow(){
        Lab lab = new Lab("Task");
        lab.completeNow();
        assertTrue(lab.isCompleted());
        assertEquals(LocalDate.now(),lab.getCompletedAt());
    }

    @Test
    public void testToString(){
        Lab lab = new Lab("Task", LocalDate.of(2020, 12, 10));
        assertEquals("Lab{title='Task', completed=true, completedAt=2020-12-10}",lab.toString());
    }

}