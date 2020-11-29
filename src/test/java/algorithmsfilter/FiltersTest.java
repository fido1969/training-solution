package algorithmsfilter;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FiltersTest {

    @Test
    public void testFilterByName() {

        List<Trainer> trainers = new ArrayList<>();

        trainers.add(new Trainer("John Doe", 1970));
        trainers.add(new Trainer("Jack Doe", 1970));
        trainers.add(new Trainer("John Smith", 1970));

        List<Trainer> filteredTrainers = new Filters().filterByName(trainers, "Doe");
        assertEquals(2,filteredTrainers.size());
        assertEquals("John Doe",filteredTrainers.get(0).getName());
        assertEquals("Jack Doe",filteredTrainers.get(1).getName());
    }
    @Test
    public void testFilterByName1() {

        List<Trainer> trainers = new ArrayList<>();

        trainers.add(new Trainer("John Doe", 1970));
        trainers.add(new Trainer("Jack Doe", 1970));
        trainers.add(new Trainer("John Smith", 1970));

        List<Trainer> filteredTrainers = new Filters().filterByName(trainers, "John");
        assertEquals(2,filteredTrainers.size());
        assertEquals("John Doe",filteredTrainers.get(0).getName());
        assertEquals("John Smith",filteredTrainers.get(1).getName());
    }

    @Test
    public void testFilterByName2() {

        List<Trainer> trainers = new ArrayList<>();

        trainers.add(new Trainer("John Doe", 1970));
        trainers.add(new Trainer("Jack Doe", 1970));
        trainers.add(new Trainer("John Smith", 1970));

        List<Trainer> filteredTrainers = new Filters().filterByName(trainers, "Smith");
        assertEquals(1,filteredTrainers.size());
        assertEquals("John Smith",filteredTrainers.get(0).getName());
    }
}