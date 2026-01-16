/*
5. Library Management System
Description: Develop a library management system:
- Use an abstract class LibraryItem with fields like itemId, title, and author.
- Add an abstract method getLoanDuration() and a concrete method getItemDetails().
- Create subclasses Book, Magazine, and DVD, overriding getLoanDuration() with specific logic.
- Implement an interface Reservable with methods reserveItem() and checkAvailability().
- Apply encapsulation to secure details like the borrower’s personal data.
- Use polymorphism to allow a general LibraryItem reference to manage all items, regardless of type.
*/

import java.util.*;

interface Reservable {
    void reserveItem(String borrowerName); // borrower name is protected
    boolean checkAvailability();
}

abstract class LibraryItem implements Reservable {
    private String itemId;
    private String title;
    private String author;

    private boolean available = true;

    // ✅ Sensitive borrower data should be private
    private String borrowerName;

    public LibraryItem(String itemId, String title, String author) {
        setItemId(itemId);
        setTitle(title);
        setAuthor(author);
    }

    public String getItemId() {
        return itemId;
    }

    private void setItemId(String itemId) {
        if (itemId == null || itemId.trim().isEmpty())
            throw new IllegalArgumentException("Item ID cannot be empty");
        this.itemId = itemId;
    }

    public String getTitle() {
        return title;
    }

    private void setTitle(String title) {
        if (title == null || title.trim().isEmpty())
            throw new IllegalArgumentException("Title cannot be empty");
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    private void setAuthor(String author) {
        if (author == null || author.trim().isEmpty())
            throw new IllegalArgumentException("Author cannot be empty");
        this.author = author;
    }

    public abstract int getLoanDuration(); // in days

    public void getItemDetails() {
        System.out.println("ItemID: " + itemId + " | Title: " + title + " | Author: " + author +
                " | Loan Days: " + getLoanDuration() + " | Available: " + available);
    }

    @Override
    public void reserveItem(String borrowerName) {
        if (!available) {
            System.out.println("Item already reserved.");
            return;
        }
        this.borrowerName = borrowerName;
        available = false;
        System.out.println("Reserved successfully by: " + borrowerName);
    }

    @Override
    public boolean checkAvailability() {
        return available;
    }

    // ✅ no direct getter for borrowerName (privacy)
    public String getBorrowerMasked() {
        return available ? "None" : "Reserved (private)";
    }
}

class BookItem extends LibraryItem {
    public BookItem(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 14;
    }
}

class MagazineItem extends LibraryItem {
    public MagazineItem(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 7;
    }
}

class DVDItem extends LibraryItem {
    public DVDItem(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 3;
    }
}

public class Main5_LibrarySystem {
    public static void main(String[] args) {
        List<LibraryItem> items = new ArrayList<>();

        items.add(new BookItem("B1", "Clean Code", "Robert Martin"));
        items.add(new MagazineItem("M1", "Time Magazine", "Editorial"));
        items.add(new DVDItem("D1", "Interstellar", "Christopher Nolan"));

        System.out.println("---- Library Items (Polymorphism) ----");
        for (LibraryItem item : items) {
            item.getItemDetails();
        }

        System.out.println("\nReserving Book...");
        items.get(0).reserveItem("Varun");

        System.out.println("\n---- After Reservation ----");
        items.get(0).getItemDetails();
    }
}
