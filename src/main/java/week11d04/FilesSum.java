//Mai junior/mid level feladat:
//Adott az aktuális könyvtárban több, fájl, melynek a nevei: number00.txt, number03.txt, number20.txt, egészen 99-ig.
//Nem minden fájl létezik, lehet, hogy bizonyos számhoz tartozó fájl kimaradt. Olvasd be az állományból a benne lévő
//számot, és ezt összegezd! Használd a Files.isRegularFile() metódust arra, hogy megnézd, létezik-e a fájl!
//Használd a Files.readString() metódust a fájl beolvasására! A FilesSum osztály int sumNumbers metódusába dolgozz!
package week11d04;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FilesSum {

    public int sumNumbers() {

        int sum = 0;

        for (int i = 0; i < 100; i++) {

            String fileName = getFileName(i);

            if (Files.isRegularFile(Path.of(fileName))) {
                int content = readFromFile(fileName);
                sum += content;
            }
        }
        return sum;
    }

    private String getFileName(int i) {

        return "number" + (i < 10 ? "0" + i : i) + ".txt";
    }

    public int readFromFile(String fileName) {

        int content;

        try {
            content = Integer.parseInt(Files.readString(Path.of(fileName)));
        } catch (IOException| NumberFormatException e) {
            throw new IllegalArgumentException("Can not read file or It is not a number in the file!", e);
        }
        return content;
    }

    public static void main(String[] args) {

        System.out.println(new FilesSum().sumNumbers());
    }


}
