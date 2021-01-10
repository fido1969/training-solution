package week04;

import java.util.ArrayList;
import java.util.List;

public class Search {

    public List<Integer> getIndexesOfChar(String str, char character) {
        if (str == null || str.isBlank()) {
            throw new IllegalArgumentException("Wrong data!");
        }
        if (character == ' ') {
            throw new IllegalArgumentException("Wrong character!");
        }
        List<Integer> getIndexesOfChars = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == character) {
                getIndexesOfChars.add(i);
            }
        }
        return getIndexesOfChars;
    }
}
