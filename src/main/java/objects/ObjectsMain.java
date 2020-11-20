package objects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ObjectsMain {

    public static void main(String[] args) {
        new Book();

        System.out.println(new Book());

        Book emptyBook = null;

        System.out.println(emptyBook);

        Book book = new Book();

        System.out.println("a "+book);

        book = null;

        System.out.println("b "+book);

        book = new Book();

        System.out.println(book);

        Book anotherBook = new Book();

        System.out.println(book == anotherBook);

        anotherBook = book;

        System.out.println(anotherBook);
        System.out.println(book == anotherBook);

        System.out.println(anotherBook instanceof Book);

        Book[] books = {new Book(), new Book(), new Book()};

        List<Book> bookList = Arrays.asList(new Book(), new Book(), new Book());

        List<Book> bookList1 = new ArrayList<>();
        bookList1.add(new Book());
        bookList1.add(new Book());
        bookList1.add(new Book());
    }
}
