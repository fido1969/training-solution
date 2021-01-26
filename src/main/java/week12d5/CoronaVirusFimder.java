package week12d5;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class CoronaVirusFimder {

    public int searchCorona() {
        int counter = 0;
        Path path = Path.of("index.html");
        try (BufferedReader br = Files.newBufferedReader(path)) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.contains("koronavirus")) ;
                counter++;
            }
        } catch (IOException ioe) {
            throw new IllegalArgumentException("Can not read file!");
        }
        return counter;
    }

    public static void main(String[] args) {

        int a = new CoronaVirusFimder().searchCorona();
        System.out.println(a);
    }
}
