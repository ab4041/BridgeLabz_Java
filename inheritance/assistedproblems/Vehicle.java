/*
Assisted Problem: Vehicle and Transport System
Description: Design a vehicle hierarchy where Vehicle is the superclass, and Car, Truck, and Motorcycle are subclasses with unique attributes.
Tasks:
1) Define a superclass Vehicle with maxSpeed and fuelType attributes and a method displayInfo().
2) Define subclasses Car, Truck, and Motorcycle, each with additional attributes, such as seatCapacity for Car.
3) Demonstrate polymorphism by storing objects of different subclasses in an array of Vehicle type and calling displayInfo() on each.
Goal: Understand how inheritance helps in organizing shared and unique features across subclasses and use polymorphism for dynamic method calls.
*/

class Vehicle {
    int maxSpeed;
    String fuelType;

    Vehicle(int maxSpeed, String fuelType) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    void displayInfo() {
        System.out.println("Max Speed: " + maxSpeed + " km/h");
        System.out.println("Fuel Type: " + fuelType);
    }
}

class Car extends Vehicle {
    int seatCapacity;

    Car(int maxSpeed, String fuelType, int seatCapacity) {
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Vehicle Type: Car");
        System.out.println("Seat Capacity: " + seatCapacity);
    }
}

class Truck extends Vehicle {
    double loadCapacity;

    Truck(int maxSpeed, String fuelType, double loadCapacity) {
        super(maxSpeed, fuelType);
        this.loadCapacity = loadCapacity;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Vehicle Type: Truck");
        System.out.println("Load Capacity: " + loadCapacity + " tons");
    }
}

class Motorcycle extends Vehicle {
    boolean hasKickStart;

    Motorcycle(int maxSpeed, String fuelType, boolean hasKickStart) {
        super(maxSpeed, fuelType);
        this.hasKickStart = hasKickStart;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Vehicle Type: Motorcycle");
        System.out.println("Has Kick Start: " + (hasKickStart ? "Yes" : "No"));
    }
}

public class VehicleTransportDemo {
    public static void main(String[] args) {
        // Polymorphism using Vehicle array
        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = new Car(180, "Petrol", 5);
        vehicles[1] = new Truck(120, "Diesel", 12.5);
        vehicles[2] = new Motorcycle(140, "Petrol", true);

        for (Vehicle v : vehicles) {
            v.displayInfo(); // dynamic dispatch (runtime polymorphism)
            System.out.println("------------");
        }
    }
}
