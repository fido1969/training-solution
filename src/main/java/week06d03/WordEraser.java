package week06d03;

import java.util.Scanner;

public class WordEraser {
    //A week06d03.WordEraser osztályban legyen egy eraseWord(String words, String word) metódus,
    // mely az első paraméter szöveget úgy változtatja meg, hogy a második paraméter összes előforulását kitörli belőle.
    // A words paraméterben a szavak szóközzel vannak elválasztva.
    // A metódus térjen vissza a törölni kívánt szavak nélküli Stringgel.
    // (Mellőzzük a replace és replaceAll használatát) (edited)

    public String eraseWord(String words, String word) {
        String[] Splitted = words.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for (String item : Splitted) {
            if (!word.equals(item)) {
                stringBuilder.append(item + " ");
            }
        }
        return stringBuilder.toString().trim();
    }

    public String eraseWordWithScanner(String words, String word) {

        Scanner scanner = new Scanner(words); //.useDelimiter(" ");

        StringBuilder stringBuilder = new StringBuilder();

        while (scanner.hasNext()) {
            String str = scanner.next();
            if (!word.equals(str)) {
                stringBuilder.append(str).append(" ");
            }
        }
        return stringBuilder.toString().trim();
    }
}
