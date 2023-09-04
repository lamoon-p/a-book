import java.util.ArrayList;
import java.util.List;

public class Book {
    private String title;
    private String author;
    private long ISBN;
    private static List<Book> books = new ArrayList<>();

    public Book(String title, String author, long ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public long getISBN() {
        return ISBN;
    }

    public void setISBN(long ISBN) {
        this.ISBN = ISBN;
    }

    public static void addBook(Book book) {

        // Title Validation
        if (book.getTitle() == null) {
            System.out.println("Please enter book title");

        } else {

            // change title to UPPER CASE
            book.setTitle(book.getTitle().toUpperCase());
            books.add(book);
            System.out.println("Book added! Name: " + book.getTitle());
        }
    }

    public static void removeBook(Book book) {
        books.remove(book);
        System.out.println("Book removed! Name: " + book.getTitle());
    }

    public static List<Book> getBookCollection() {
        return books;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", ISBN=" + ISBN +
                '}';
    }
}