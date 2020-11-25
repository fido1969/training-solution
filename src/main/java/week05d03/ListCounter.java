package week05d03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListCounter {
    //Írj egy olyan metódust az week05.d03.ListCounter osztályban, mely egy kapott Listából (String)
    // összeszámolja azokat amik 'a' vagy 'A' betűvel kezdődnek,
    //Ha nulla elemű a tömb,vagy nincs benne ilyen elem, akkor 0-t adjon vissza.



    private static final String A_A = "aA";

    public int setStringList(List<String> stringList) {

        int count = 0;
        if (stringList.size()==0){
            System.out.println(0);
        }else {
            for (int i = 0; i < stringList.size(); i++) {
                if (stringList.get(i).startsWith("a")||stringList.get(i).startsWith("A")) {
                    count++;
                }
            }
            return count;
        }
        return 0;
    }


    public static void main(String[] args) {
        ListCounter listCounter= new ListCounter();

        List<String> stringList = Arrays.asList("Alma", "ablak", "ajtó");
        System.out.println(listCounter.setStringList(stringList));
    }
}
