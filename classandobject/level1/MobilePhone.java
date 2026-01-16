/*
Program to Handle Mobile Phone Details
Problem Statement:
Create a MobilePhone class with attributes brand, model, and price.
Add a method to display phone details.
*/

class MobilePhone {
    private String brand;
    private String model;
    private double price;

    public MobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: ₹" + price);
    }
}

public class Main {
    public static void main(String[] args) {
        MobilePhone phone = new MobilePhone("Samsung", "S23", 75000);
        phone.displayDetails();
    }
}
