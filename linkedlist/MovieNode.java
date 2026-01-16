/*
2. Doubly Linked List: Movie Management System
Problem Statement: Implement a movie management system using a doubly linked list.
Each node will represent a movie and contain Movie Title, Director, Year of Release, and Rating.
Implement:
- Add movie at beginning, end, or specific position.
- Remove movie by Movie Title.
- Search movie by Director or Rating.
- Display movies forward and reverse.
- Update movie rating by title.

Hint:
- Doubly linked list with next and prev pointers.
- Maintain both head and tail.
*/

class MovieNode {
    String title, director;
    int year;
    double rating;
    MovieNode next, prev;

    MovieNode(String title, String director, int year, double rating) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.rating = rating;
    }
}

class MovieDoublyList {
    private MovieNode head, tail;

    public void addAtBeginning(String title, String director, int year, double rating) {
        MovieNode newNode = new MovieNode(title, director, year, rating);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    public void addAtEnd(String title, String director, int year, double rating) {
        MovieNode newNode = new MovieNode(title, director, year, rating);

        if (tail == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    // 1-based position
    public void addAtPosition(int pos, String title, String director, int year, double rating) {
        if (pos <= 1) {
            addAtBeginning(title, director, year, rating);
            return;
        }

        MovieNode newNode = new MovieNode(title, director, year, rating);
        MovieNode temp = head;

        for (int i = 1; i < pos - 1 && temp != null; i++) temp = temp.next;

        if (temp == null || temp.next == null) {
            addAtEnd(title, director, year, rating);
            return;
        }

        newNode.next = temp.next;
        newNode.prev = temp;
        temp.next.prev = newNode;
        temp.next = newNode;
    }

    public void removeByTitle(String title) {
        if (head == null) {
            System.out.println("No movies to remove.");
            return;
        }

        MovieNode temp = head;
        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {
                // If deleting head
                if (temp == head) head = head.next;
                // If deleting tail
                if (temp == tail) tail = tail.prev;

                if (temp.prev != null) temp.prev.next = temp.next;
                if (temp.next != null) temp.next.prev = temp.prev;

                // Clean pointers
                temp.next = null;
                temp.prev = null;

                System.out.println("Movie removed: " + title);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Movie not found.");
    }

    public void searchByDirector(String director) {
        MovieNode temp = head;
        boolean found = false;
        while (temp != null) {
            if (temp.director.equalsIgnoreCase(director)) {
                System.out.println(temp.title + " (" + temp.year + ") Rating=" + temp.rating);
                found = true;
            }
            temp = temp.next;
        }
        if (!found) System.out.println("No movies found for director: " + director);
    }

    public void searchByRating(double rating) {
        MovieNode temp = head;
        boolean found = false;
        while (temp != null) {
            if (temp.rating >= rating) { // searching movies with rating >= given
                System.out.println(temp.title + " -> Rating=" + temp.rating);
                found = true;
            }
            temp = temp.next;
        }
        if (!found) System.out.println("No movies found with rating >= " + rating);
    }

    public void updateRating(String title, double newRating) {
        MovieNode temp = head;
        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {
                temp.rating = newRating;
                System.out.println("Rating updated for: " + title);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Movie not found.");
    }

    public void displayForward() {
        if (head == null) {
            System.out.println("No movies.");
            return;
        }
        System.out.println("---- Movies Forward ----");
        MovieNode temp = head;
        while (temp != null) {
            System.out.println(temp.title + " | " + temp.director + " | " + temp.year + " | Rating=" + temp.rating);
            temp = temp.next;
        }
    }

    public void displayReverse() {
        if (tail == null) {
            System.out.println("No movies.");
            return;
        }
        System.out.println("---- Movies Reverse ----");
        MovieNode temp = tail;
        while (temp != null) {
            System.out.println(temp.title + " | " + temp.director + " | " + temp.year + " | Rating=" + temp.rating);
            temp = temp.prev;
        }
    }
}

public class Main2_MovieManagement {
    public static void main(String[] args) {
        MovieDoublyList movies = new MovieDoublyList();

        movies.addAtEnd("Interstellar", "Christopher Nolan", 2014, 9.0);
        movies.addAtBeginning("Inception", "Christopher Nolan", 2010, 8.8);
        movies.addAtPosition(2, "Avatar", "James Cameron", 2009, 7.8);

        movies.displayForward();
        movies.displayReverse();

        movies.searchByDirector("Christopher Nolan");
        movies.updateRating("Avatar", 8.2);
        movies.removeByTitle("Inception");

        movies.displayForward();
    }
}
