package methodstructure;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BodyMassTest {

    @Test
    void getWeightAndHeight() {
        BodyMass janos = new BodyMass(70, 1.75);
        assertEquals(70, janos.getWeight());
        assertEquals(1.75, janos.getHeight());
    }

    @Test
    void bodyMassIndexOver() {
        BodyMass janos = new BodyMass(70, 1.65);
        assertEquals(25.71, janos.bodyMassIndex());
        assertEquals(BmiCategory.OVERWEIGHT, janos.body());
    }

    @Test
    void bodyMassIndexUnderUnder() {
        BodyMass janos = new BodyMass(55, 1.85);
        assertEquals(16.07, janos.bodyMassIndex());
        assertEquals(BmiCategory.UNDERWEIGHT, janos.body());
    }

    @Test
    void body() {
        BodyMass janos = new BodyMass(55, 1.65);
        assertEquals(20.2, janos.bodyMassIndex());
        assertEquals(BmiCategory.NORMAL, janos.body());
    }

    @Test
    void isThinnerThan() {
        BodyMass janos = new BodyMass(55, 1.85);
        BodyMass anna = new BodyMass(55, 1.60);
        assertTrue(janos.isThinnerThan(anna));
    }

}