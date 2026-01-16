/*
Problem Statement:
Create a Book class with attributes title, author, and price.
Provide both default and parameterized constructors.
*/

class Book {
    private String title;
    private String author;
    private double price;

    // Default constructor
    public Book() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
    }

    // Parameterized constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println(title + " by " + author + " | Price: ₹" + price);
    }
}

public class Main {
    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book("Java", "James Gosling", 499);

        b1.displayDetails();
        b2.displayDetails();
    }
}
