package attributes.book;

public class BookMain {

    public static void main(String[] args) {

        Book book = new Book("math");
        System.out.println(book.getTitle());

        book.setTitle("phisics");
        System.out.println(book.getTitle());

        book = new Book("chemistry");
        System.out.println(book.getTitle());


    }
}
