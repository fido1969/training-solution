package week11d03;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WordFilterTest {

    WordFilter wordFilter = new WordFilter();

    @Test
    void wordsWithCharC() {
        List<String> words = new ArrayList<>();
        words.add("cica");
        assertEquals(1, wordFilter.wordsWithChar(words, 'c').size());
    }

    @Test
    void wordsWithoutCharC() {
        List<String> words = new ArrayList<>();
        words.add("kutya");
        assertEquals(0, wordFilter.wordsWithChar(words, 'c').size());
    }

    @Test
    void wordsWithEmptyChar() {
        List<String> words = new ArrayList<>();
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () -> wordFilter.wordsWithChar(words, 'c'));
        assertEquals("Empty list!",iae.getMessage());
    }

    @Test
    void wordsWithNullChar() {
        List<String> words = null;
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () -> wordFilter.wordsWithChar(words, 'c'));
        assertEquals("Empty list!",iae.getMessage());

    }

    @Test
    void wordsWithGoodChar() {
        List<String> words = List.of("cica", "kutya", "cápa", "lúd");
        assertEquals(List.of("cica","cápa"),wordFilter.wordsWithChar(words,'c'));
    }
}