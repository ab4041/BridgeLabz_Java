/*
Problem Statement:
Create a Book class with attributes title, author, price, and availability.
Implement a method to borrow a book.
*/

class LibraryBook {
    private String title;
    private String author;
    private double price;
    private boolean available;

    public LibraryBook(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = true;
    }

    public void borrowBook() {
        if (available) {
            available = false;
            System.out.println("Book borrowed successfully");
        } else {
            System.out.println("Book not available");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        LibraryBook book = new LibraryBook("Java", "James", 400);
        book.borrowBook();
        book.borrowBook();
    }
}
