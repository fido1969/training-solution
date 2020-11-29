package week01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OperationTest {

    @Test
    public void operationTest() {
        Operation operation = new Operation("120+40");
        assertEquals(160, operation.getResult());
    }

    @Test
    public void operationTest1() {
        Operation operation = new Operation("120+40");
        assertEquals(120+40, operation.getResult());
    }
}