/*
Problem Statement:
Create a CarRental class with attributes customerName, carModel, rentalDays.
Calculate total cost.
*/

class CarRental {
    private String customerName;
    private String carModel;
    private int rentalDays;

    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    private double calculateCost() {
        return rentalDays * 1500;
    }

    public void display() {
        System.out.println(customerName + " | " + carModel + " | Cost: ₹" + calculateCost());
    }
}

public class Main {
    public static void main(String[] args) {
        CarRental rental = new CarRental("Varun", "Swift", 4);
        rental.display();
    }
}
