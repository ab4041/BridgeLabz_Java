/*
Sample Program 2: Library Management System

Create a Book class with:
Static:
- libraryName
- displayLibraryName()

This:
- Initialize title, author, isbn

Final:
- isbn should be final

Instanceof:
- Validate object before displaying details
*/

class Book {
    static String libraryName = "Central Library";

    private String title;
    private String author;
    private final String isbn;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public void displayDetails(Object obj) {
        if (obj instanceof Book) {
            System.out.println(title + " by " + author + " | ISBN: " + isbn);
        }
    }

    public static void displayLibraryName() {
        System.out.println("Library: " + libraryName);
    }
}

public class Main {
    public static void main(String[] args) {
        Book book = new Book("Java", "James Gosling", "ISBN123");
        Book.displayLibraryName();
        book.displayDetails(book);
    }
}
