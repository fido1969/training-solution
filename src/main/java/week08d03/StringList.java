package week08d03;

import java.util.ArrayList;
import java.util.List;

public class StringList {
    //Mai Junior/Mid-level feladat:
    //Készíts week08d03 csomagban egy StringLists osztályt és benne egy stringListsUnion(List<String> first,
    // List<String> second) metódust,mely két string listát vár paraméterül és visszaadja az uniójukat.
    // Az úniónak minden elemet tartalmaznia kell mindkét listából, de egy elem nem szerepelhet kétszer!
    // Feltételezhetjük, hogy az egyes listákban minden elem legfejjebb egyszer fordul elő.
    // first: "a" "b" "c"    second: "a" "d"    unio: "a" "b" "c" "d"

    public List<String> stringListsUnion(List<String> first, List<String> second) {
        checkValid(first, second);
        List<String> result = new ArrayList<>();
        result.addAll(first);
        for (String element : second) {
            if (!result.contains(element)) {
                result.add(element);
            }
        }
        return result;
    }

    private void checkValid(List<String> first, List<String> second) {
        if (first == null || second == null || first.isEmpty() || second.isEmpty()) {
            throw new NullPointerException("List can not be empty");
        }
    }

}