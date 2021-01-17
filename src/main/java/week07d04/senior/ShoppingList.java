//A ShoppingList osztályba írj egy long calculateSum(String path) metódust, mely a paraméterként átadott fájlból
//beolvassa a bevásárlólista tartalmát, és összegzi az árat! A fájl a következő formátumú sorokat tartalmazza:
//kenyér;2;30, ahol az első a termék neve, a második a darabszám, a harmadik az egységár.
//Azaz ezen sor esetén 2 * 30 = 60 értékkel kell számolni.

package week07d04.senior;

import java.util.Scanner;

public class ShoppingList {

    public long calculateSum(String path) {

        if (path == null || path.isBlank() || path.isEmpty()) {
            throw new IllegalArgumentException("Invalid path!");
        }

        int result = 0;

        try (Scanner scanner = new Scanner(ShoppingList.class.getResourceAsStream(path))) {
            scanner.useDelimiter(";");
            while (scanner.hasNext()) {
                String str = scanner.next();
                int pieces = Integer.parseInt(scanner.next());
                int price = Integer.parseInt(scanner.next());
                result += pieces * price;
            }
        }
        return result;
    }
}
