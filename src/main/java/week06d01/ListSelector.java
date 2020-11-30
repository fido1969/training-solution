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
    //Bónusz: A páros sorszámú elemek vesszővel elválasztva. pl.: {"alma","körte","Barack"}--> [almabarack]

    public StringBuilder getEvenIndexElements(List<String> stringList) {

        if (stringList == null) {
            throw new IllegalArgumentException("Null parameter not accepted!");
        }
        StringBuilder stringBuilder = new StringBuilder("");
        if (stringList.size() == 0) {
            return stringBuilder;
        }
        stringBuilder = new StringBuilder("[");
        stringBuilder.append(stringList.get(0));
        for (int i = 1; i < stringList.size(); i++) {
            if (i % 2 == 0) {
                stringBuilder.append(","+stringList.get(i));
            }
        }
        return stringBuilder.append("]");
    }

   /* public static void main(String[] args) {
        List<String> list0 = Arrays.asList("aa", "bb", "cc", "dd", "ee", "ff", "gg", "hh");
        List<String> list1 = Arrays.asList();
        List<String> list2 = null;
        ListSelector listSelector = new ListSelector();
        System.out.println("List0: "+listSelector.getEvenIndexElements(list0));
        System.out.println("List1: "+listSelector.getEvenIndexElements(list1));
        System.out.println(listSelector.getEvenIndexElements(list2));
    }*/
}
