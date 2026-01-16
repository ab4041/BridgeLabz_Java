/*
Problem Statement:
Create a HotelBooking class with attributes guestName, roomType, and nights.
Use default, parameterized, and copy constructors.
*/

class HotelBooking {
    private String guestName;
    private String roomType;
    private int nights;

    public HotelBooking() {
        this("Guest", "Standard", 1);
    }

    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    public HotelBooking(HotelBooking booking) {
        this(booking.guestName, booking.roomType, booking.nights);
    }

    public void display() {
        System.out.println(guestName + " | " + roomType + " | Nights: " + nights);
    }
}

public class Main {
    public static void main(String[] args) {
        HotelBooking b1 = new HotelBooking("Varun", "Deluxe", 3);
        HotelBooking b2 = new HotelBooking(b1);

        b2.display();
    }
}
