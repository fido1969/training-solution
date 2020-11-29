package algorithmstransform;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TransformationTest {

    @Test
    public void transformationTest() {
        Transformation transformation = new Transformation();
        List<Trainer> trainers = new ArrayList<>();
        trainers.add(new Trainer("John Doe", 1970));
        trainers.add(new Trainer("Jack Doe", 1980));
        List<String> names = transformation.toNames(trainers);
        assertEquals(2,names.size());
        assertEquals("John Doe",names.get(0));
        assertEquals("Jack Doe",names.get(1));
    }

    @Test
    public void transformationTest1() {
        Transformation transformation = new Transformation();
        List<Trainer> trainers = new ArrayList<>();
        trainers.add(new Trainer("John Doe", 1970));
        trainers.add(new Trainer("Jack Doe", 1980));
        List<String> names = transformation.toNamesYearOfBirthBefore(trainers,1975);
        assertEquals(1,names.size());
        assertEquals("John Doe",names.get(0));
    }



}