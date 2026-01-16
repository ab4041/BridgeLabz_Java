/*
Problem Statement:
Create a MovieTicket class with attributes movieName, seatNumber, and price.
Add methods to book ticket and display details.
*/

class MovieTicket {
    private String movieName;
    private int seatNumber;
    private double price;

    public MovieTicket(String movieName) {
        this.movieName = movieName;
    }

    public void bookTicket(int seatNumber, double price) {
        this.seatNumber = seatNumber;
        this.price = price;
    }

    public void displayTicket() {
        System.out.println("Movie: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: ₹" + price);
    }
}

public class Main {
    public static void main(String[] args) {
        MovieTicket ticket = new MovieTicket("Interstellar");
        ticket.bookTicket(15, 250);
        ticket.displayTicket();
    }
}
