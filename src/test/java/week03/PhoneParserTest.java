package week03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhoneParserTest {

    String str = "10-1234567";
    PhoneParser phoneParser = new PhoneParser();

    @Test
    public void testPhoneParser() {
        assertEquals("10", phoneParser.parse(str).getPrefix());
        assertEquals("1234567", phoneParser.parse(str).getNumber());
        assertEquals("10-1234567", phoneParser.parse(str).toString());
    }
}