package week02;

import java.util.ArrayList;
import java.util.List;

public class Language {

    public static void main(String[] args) {

        List<String> languages = new ArrayList<>();

        languages.add("Java");
        languages.add("Phyton");
        languages.add("JavaScript");


        for (String language : languages) {
            if (language.length() > 5) {
                System.out.println(language);
            }
        }
    }
}

