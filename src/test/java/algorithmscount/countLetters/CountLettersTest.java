package algorithmscount.countLetters;

import org.junit.jupiter.api.Test;
import week05d02.ChangeLetter;

import static org.junit.jupiter.api.Assertions.*;

class CountLettersTest {

    @Test
    public void countLettersTest() {
        CountLetters countLetters = new CountLetters();
        assertEquals(2,countLetters.countLetters("Cicamica",'c'));
    }

}