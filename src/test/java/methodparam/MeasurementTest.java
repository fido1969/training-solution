package methodparam;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MeasurementTest {

    private Measurement measurement;

    @BeforeEach
    public void setUp() {
        double[] numbers = new double[]{10, 4, 3, 8, 12, 5, 7};
        this.measurement = new Measurement(numbers);
    }

    @AfterEach
    public void tearNull() {
        this.measurement = null;
    }

    @Test
    public void findFirstIndexInLimit() {
        assertEquals(5, this.measurement.findFirstIndexInLimit(4, 8));
        assertEquals(-1, this.measurement.findFirstIndexInLimit(0, 2));
    }

    @Test
    public void minimumTest() {
        assertEquals(3, this.measurement.minimum());
    }

    @Test
    public void maximumTest() {
        assertEquals(12, this.measurement.maximum());
    }

    @Test
    public void minmaxTest() {
        assertEquals(12, new ExtremValues(this.measurement.minimum(), this.measurement.maximum()).getMax());
        assertEquals(3, new ExtremValues(this.measurement.minimum(), this.measurement.maximum()).getMin());
    }

    @Test
    public void minmax() {
        ExtremValues extremValues = this.measurement.minmax();
        assertEquals(3,extremValues.getMin());
        assertEquals(12,extremValues.getMax());
    }

    @Test
    public void arrayNullTest() {
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () -> new Measurement(null));
        assertEquals("Invalid array!", iae.getMessage());
    }
}