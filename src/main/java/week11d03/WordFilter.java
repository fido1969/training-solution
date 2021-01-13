//Mai junior/mid-level feladat: Készíts egy WordFilter osztályt, melyben van egy
//List<String> wordsWithChar(List<String> words, char c) metódus. A metódus kiválógatja a paraméterül
//kapott String listából azokat a szavakat, melyekben előfordul a c karakter, majd ezeket visszaadja egy
//listában.

package week11d03;

import java.util.ArrayList;
import java.util.List;

public class WordFilter {
    public List<String> wordsWithChar(List<String> words, char c) {

        List<String> filteredWords = new ArrayList<>();

        if (words == null || words.size() == 0) {
            throw new IllegalArgumentException("Empty list!");
        }
        for (String word : words) {
            if (word.indexOf(c) >= 0) {
                filteredWords.add(word);
            }
        }
        return filteredWords;
    }
}
