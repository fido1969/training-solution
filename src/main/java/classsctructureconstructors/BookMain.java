package classsctructureconstructors;

public class BookMain {
    public static void main(String[] args) {
        Book book = new Book("Jókai Mór", "Az aranyember");

        System.out.println("The author: " + book.getAuthor());
        System.out.println("The title of the book: " + book.getTitle());
        book.register("RN123654");
        System.out.println("The registration number of the book: " + book.getRegNumber());
    }
}
