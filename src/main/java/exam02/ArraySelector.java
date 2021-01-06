
//Írj egy olyan metódust az ArraySelector osztályban, mely egy kapott tömbből minden második elemet kiválogat, és egy szövegként összerak, szögletes zárójelek között!
//A páros megállapítása index szerint működik. Azaz az első, nulla indexű elem páros, a második, azaz egyes indexű elem páratlan, stb.
//Ha nulla elemű a tömb, akkor üres stringet adjon vissza!
package exam02;

public class ArraySelector {
    public String selectEvens(int[] integerArray) {
        if (integerArray.length == 0) {
            return "";
        }
        String selectedItems = "[";
        for (int i = 0; i < integerArray.length; i++) {
            if (i % 2 == 0) {
                selectedItems += integerArray[i] + ", ";
            }
        }
        return selectedItems.substring(0, selectedItems.length() - 2) + "]";
    }

    public static void main(String[] args) {
        System.out.println(new ArraySelector().selectEvens(new int[]{1, 2, 3, 4, 5}));
    }
}