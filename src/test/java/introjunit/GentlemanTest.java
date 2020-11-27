package introjunit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GentlemanTest {
    @Test
    public void byNormalName() {
        // Given
        String name = "John Doe";

        // When
        String hi = new Gentleman().sayHello(name);

        // Then
        assertEquals("Hello John Doe", hi);
    }

    @Test
    public void byNolName() {
        // Given
        String name = null;

        // When
        String hi = new Gentleman().sayHello(name);

        // Then
        assertEquals("Hello Nobody", hi);
    }



}