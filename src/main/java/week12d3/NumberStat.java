//Mai Junior/Mid-level feladat:
//Készítsd el a week12d03.NumberStat osztályt melyben legyen egy metódus, ami paraméterül vár egy egész számokból álló listát.
//Add vissza azt a számot amelyik pontosan egyszer szerepel a listában. Ha több ilyen szám van akkor a kisebbet! Ellenőrizd, hogy olyan listát fogadunk el,
//ami legalább 1 elemű, ha a lista nem ilyen, dobj kivételt! pl: {1,1,5,3,4,5,6,5,6,4,1,6,5,4} A megoldás: 3
//Bónusz: Módosítsd az osztályt. Legyen egy egész számokból álló lista attribútuma. A fent megírt metódus ezen a listán dolgozzon.
//A lista elemeit fájlból töltsük fel. A file úgy néz ki, hogy egy sorban három szám van vesszővel elválasztva. Tehát:
//1,1,4
//2,3,5
//2,2,5
package week12d3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NumberStat {
    public int numberFinder(List<Integer> numbers) {
        if (numbers == null || numbers.isEmpty()) {
            throw new IllegalArgumentException("Legalább 1 elemű lista kell.");
        }
        List<Integer> orderedNumbers = new ArrayList<>(numbers);
        Collections.sort(orderedNumbers);
        int result = orderedNumbers.get(0);
        int smalest = counter(orderedNumbers.get(0), orderedNumbers);
        int current = smalest;
        for (int i = 1; i < orderedNumbers.size(); i++) {
            if (!orderedNumbers.get(i).equals(orderedNumbers.get(i - 1))) {
                current = counter(orderedNumbers.get(i), orderedNumbers);
            }
            result = current < smalest ? orderedNumbers.get(i) : result;
        }
        return result;
    }

    private int counter(int number, List<Integer> numbers) {
        int counter = 0;
        for (int num : numbers) {
            if (number == num) {
                counter++;
            }
        }
        return counter;
    }
}
