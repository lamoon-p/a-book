public class Main {

    public static void main(String[] args) {

        Book book1 = new Book("Harry Potter", "J.K.", 1234567891234L);
        Book book2 = new Book("Rich Dad", "Robert K.", 4321987654321L);
        Book book3 = new Book(null, "KKK", 84518915889L);

        Book.addBook(book1);
        Book.addBook(book2);
        Book.addBook(book3);

        for (Book book: Book.getBookCollection()) {
            System.out.println(book);
        }

        Book.removeBook(book1);
        Book.removeBook(book2);
    }
}