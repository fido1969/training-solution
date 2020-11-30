package week06d01;

import com.sun.source.tree.IfTree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListSelector {

    //Írj egy olyan metódust az week06d01.ListSelector osztályban, mely egy kapott listából minden második elemet
    //kiválogat, és egy szövegként összerak, szögletes zárójelek között.
    //A páros megállapítása index szerint működik. Azaz az első, nulla indexű elem páros, a második,
    // azaz egyes indexű elem páratlan, stb.
    //Ha üres a lista, akkor üres stringet adjunk vissza. Ha a paraméterül kapott lista null, akkor dobjunk
    // IllegalArgumentExceptiont a metódusban.

    public StringBuilder ListSelector(List<String> stringList) {

        if (stringList == null){
            throw new IllegalArgumentException("This List is \"null\"!");
        }
        StringBuilder stringBuilder = new StringBuilder("");
        if (stringList.size() == 0) {
            return stringBuilder;
        }
        stringBuilder = new StringBuilder("[");
        for (int i = 0; i < stringList.size(); i++) {
            if (i % 2 == 0) {
                stringBuilder.append(stringList.get(i));
            }
        }
        return stringBuilder.append("]");
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("aa", "bb", "cc", "dd", "ee", "ff", "gg", "hh");
        //List<String> list = Arrays.asList();
        //List<String> list = null;
        ListSelector listSelector = new ListSelector();
        System.out.println(listSelector.ListSelector(list).toString());
    }
}
