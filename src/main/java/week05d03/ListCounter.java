package week05d03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListCounter {
    //Írj egy olyan metódust az week05.d03.ListCounter osztályban, mely egy kapott Listából (String)
    // összeszámolja azokat amik 'a' vagy 'A' betűvel kezdődnek,
    //Ha nulla elemű a tömb,vagy nincs benne ilyen elem, akkor 0-t adjon vissza.

    public int setStringList(List<String> stringList) {

        int count = 0;
        for (int i = 0; i < stringList.size(); i++) {
            if (stringList.get(i).startsWith("a") || stringList.get(i).startsWith("A")) {
                count++;
            }
        }
        return count;
    }


   /* public int setStringList1(List<String> stringList) {

        int count = 0;
        for (String str : stringList) {
            if (str.toUpperCase().startsWith("A")) {
                count++;
            }
        }
        return count;
    }*/

    /*public int setStringList2(List<String> stringList) {

        int count = 0;
        for (String str : stringList) {
            if (str.toUpperCase().charAt(0) == 'A') {
                count++;
            }
        }
        return count;
    }*/

    /*public static void main(String[] args) {
        ListCounter listCounter = new ListCounter();

        List<String> stringList = Arrays.asList("Alma", "ablak", "ajtó");
        System.out.println(listCounter.setStringList(stringList));
        System.out.println(listCounter.setStringList1(stringList));
        System.out.println(listCounter.setStringList2(stringList));

    }*/
}
