package week04;

import java.util.ArrayList;
import java.util.List;

public class Search {

    public List<Integer> getIndexOfChar(String str,char c){
        List<Integer> result = new ArrayList<>();
        for (int i=0;i<str.length();i++){
            if (str.charAt(i)==c){
                result.add(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Search search= new Search();
        System.out.println(search.getIndexOfChar("terefe",'e'));
    }
}
