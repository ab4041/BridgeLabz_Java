/*
Hybrid Inheritance (Simulating Multiple Inheritance) - Sample Problem 2: Vehicle Management System with Hybrid Inheritance
Description: Model a vehicle system where Vehicle is the superclass and ElectricVehicle and PetrolVehicle are subclasses.
Additionally, create a Refuelable interface implemented by PetrolVehicle.
Tasks:
1) Define a superclass Vehicle with attributes like maxSpeed and model.
2) Create an interface Refuelable with a method refuel().
3) Define subclasses ElectricVehicle and PetrolVehicle.
   PetrolVehicle should implement Refuelable, while ElectricVehicle includes a charge() method.
Goal: Use hybrid inheritance by having PetrolVehicle implement both Vehicle and Refuelable,
demonstrating how Java interfaces allow adding multiple behaviors.
*/

class VehicleBase {
    int maxSpeed;
    String model;

    VehicleBase(int maxSpeed, String model) {
        this.maxSpeed = maxSpeed;
        this.model = model;
    }
}

interface Refuelable {
    void refuel();
}

class ElectricVehicle extends VehicleBase {
    ElectricVehicle(int maxSpeed, String model) {
        super(maxSpeed, model);
    }

    void charge() {
        System.out.println(model + " is charging...");
    }
}

class PetrolVehicle extends VehicleBase implements Refuelable {
    PetrolVehicle(int maxSpeed, String model) {
        super(maxSpeed, model);
    }

    @Override
    public void refuel() {
        System.out.println(model + " is refueling petrol...");
    }
}

public class VehicleHybridDemo {
    public static void main(String[] args) {
        ElectricVehicle ev = new ElectricVehicle(160, "Tesla Model 3");
        PetrolVehicle pv = new PetrolVehicle(180, "Hyundai i20");

        ev.charge();
        pv.refuel();
    }
}
