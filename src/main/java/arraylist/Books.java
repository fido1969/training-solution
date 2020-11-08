package arraylist;

import java.util.ArrayList;
import java.util.List;

public class Books {

    private List<String> titles = new ArrayList<>();

    public void add(String title){
        titles.add(title);
    }
    public List<String> getTitles(){
        return titles;
    }

    public List<String> findAllByPrefix(String prefix) {
        List<String> found = new ArrayList<>();
        for (String title : titles) {
            if (title.startsWith(prefix)) {
                found.add(title);
            }
        }
        return found;
    }
    // Remove only the first match
    public List<String> removeByPrefix(String prefix) {
              for (String title : titles) {
            if (title.startsWith(prefix)) {
                titles.remove(title);
            }
        }
              return titles;
    }

    public List<String> removeAllByPrefix(String prefix) {
        List<String> delete = new ArrayList<>();
        for (String title : titles) {
            if (title.startsWith(prefix)) {
                delete.add(title);
            }
        }
        titles.removeAll(delete);
        return titles;
    }

    public static void main(String[] args) {
        Books book = new Books();

        book.titles.add("Az arany ember");
        book.titles.add("Toldi");
        book.titles.add("Tenkes kapitánya");
        book.titles.add("Avatar");
        System.out.println(book.getTitles().toString());
        System.out.println(book.findAllByPrefix("A"));
        System.out.println(book.removeAllByPrefix("A"));
        System.out.println(book.removeByPrefix("T"));
    }
}