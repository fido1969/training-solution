//Készítsünk egy CharCounter osztályt, melyben van egy int countChars(String[] chars) metódus. A feladat az,
//hogy összeszámoljuk azokat a karaktereket az összes chars-ban lévő String-ből, amelyek mindegyik String-ben
//szerepelnek. Példa: Ha a chars-ban ["abc", "cba", "ab"] szerepel, akkor a visszatérési érték 2,
//mert az a és a b karakter szerepel mindegyik String-ben.

package week11d03.senior;

import java.util.HashSet;
import java.util.Set;

public class CharCounter {

    static int countChars(String[] chars) {
        int result = 0;
        if (chars.length > 0) {
            Set<Character> first = new HashSet<>();
            for (char c : chars[0].toCharArray()) {
                first.add(c);
            }
            for (int i = 1; i < chars.length; i++) {
                Set<Character> next = new HashSet<>();
                for (char c : chars[i].toCharArray()) {
                    next.add(c);
                }
                first.retainAll(next);
            }
            result = first.size();
        }
        return result;
    }

    public static void main(String[] args) {
        int result = countChars(new String[]{"abc", "cba", "ab"});
        System.out.println(result);

    }
}
