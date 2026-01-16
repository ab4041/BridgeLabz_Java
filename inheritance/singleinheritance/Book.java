/*
Single Inheritance - Sample Problem 1: Library Management with Books and Authors
Description: Model a Book system where Book is the superclass, and Author is a subclass.
Tasks:
1) Define a superclass Book with attributes like title and publicationYear.
2) Define a subclass Author with additional attributes like name and bio.
3) Create a method displayInfo() to show details of the book and its author.
Goal: Practice single inheritance by extending the base class and adding more specific details in the subclass.
*/

class Book {
    String title;
    int publicationYear;

    Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }
}

class Author extends Book {
    String authorName;
    String bio;

    Author(String title, int publicationYear, String authorName, String bio) {
        super(title, publicationYear);
        this.authorName = authorName;
        this.bio = bio;
    }

    void displayInfo() {
        System.out.println("Book Title: " + title);
        System.out.println("Publication Year: " + publicationYear);
        System.out.println("Author Name: " + authorName);
        System.out.println("Author Bio: " + bio);
    }
}

public class LibraryDemo {
    public static void main(String[] args) {
        Author a = new Author("Java for Beginners", 2024, "Varun Prakash", "Loves teaching Java in simple way.");
        a.displayInfo();
    }
}
