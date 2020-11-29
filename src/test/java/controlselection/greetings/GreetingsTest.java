package controlselection.greetings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreetingsTest {

    @Test
    public void testGreet() {
        Greetings greetings = new Greetings();
        assertEquals("jó éjt", greetings.greet(3, 30));
        assertEquals("jó éjt", greetings.greet(5, 0));
        assertEquals("jó reggelt", greetings.greet(5, 1));
        assertEquals("jó reggelt", greetings.greet(9, 0));
        assertEquals("jó napot", greetings.greet(9, 15));
        assertEquals("jó napot", greetings.greet(18, 30));
        assertEquals("jó estét", greetings.greet(18, 31));
        assertEquals("jó estét", greetings.greet(20, 0));
        assertEquals("jó éjt", greetings.greet(20, 1));
    }

}