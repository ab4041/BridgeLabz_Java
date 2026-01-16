/*
Problem Statement:
Book with ISBN(public), title(protected), author(private)
*/

class Book {
    public String ISBN;
    protected String title;
    private String author;

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }
}

class EBook extends Book {
    public void display() {
        System.out.println(ISBN + " " + title);
    }
}
