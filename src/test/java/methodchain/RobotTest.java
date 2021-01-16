package methodchain;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RobotTest {

    private Robot robot;

    @BeforeEach
    public void setUp() {
        this.robot = new Robot();
    }

    @AfterEach
    public void tearDown() {
        this.robot = null;
    }

    @Test
    public  void testGo(){
        robot.go(10).go(15).go(45);
        assertEquals(70,robot.getDistance());
    }

    @Test
    public  void testRotate(){
        robot.rotate(10).rotate(15).rotate(45);
        assertEquals(0,robot.getDistance());
        assertEquals(70,robot.getAzimut());
    }

    @Test
    public  void testRotateAndGo(){
        robot.rotate(10).go(15).rotate(45);
        assertEquals(15,robot.getDistance());
        assertEquals(55,robot.getAzimut());
    }

    @Test
    public  void registerNavigationPoint(){
        robot.rotate(10).go(15).registerNavigationPoint().go(20).rotate(25).registerNavigationPoint();
        assertEquals("[distance: 15 azimut: 10, distance: 35 azimut: 35]",robot.getNavigationList().toString());
    }
}