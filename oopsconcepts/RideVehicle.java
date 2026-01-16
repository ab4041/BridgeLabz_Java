/*
8. Ride-Hailing Application
Description: Develop a ride-hailing application:
- Define an abstract class Vehicle with fields like vehicleId, driverName, and ratePerKm.
- Add abstract methods calculateFare(double distance) and a concrete method getVehicleDetails().
- Create subclasses Car, Bike, and Auto, overriding calculateFare() based on type-specific rates.
- Use an interface GPS with methods getCurrentLocation() and updateLocation().
- Secure driver and vehicle details using encapsulation.
- Demonstrate polymorphism by creating a method to calculate fares for different vehicle types dynamically.
*/

import java.util.*;

interface GPS {
    String getCurrentLocation();
    void updateLocation(String newLocation);
}

abstract class RideVehicle implements GPS {
    private String vehicleId;
    private String driverName;
    private double ratePerKm;

    private String currentLocation = "Unknown"; // encapsulated GPS

    public RideVehicle(String vehicleId, String driverName, double ratePerKm) {
        setVehicleId(vehicleId);
        setDriverName(driverName);
        setRatePerKm(ratePerKm);
    }

    public String getVehicleId() {
        return vehicleId;
    }

    private void setVehicleId(String vehicleId) {
        if (vehicleId == null || vehicleId.trim().isEmpty())
            throw new IllegalArgumentException("Vehicle ID cannot be empty");
        this.vehicleId = vehicleId;
    }

    public String getDriverName() {
        return driverName;
    }

    private void setDriverName(String driverName) {
        if (driverName == null || driverName.trim().isEmpty())
            throw new IllegalArgumentException("Driver name cannot be empty");
        this.driverName = driverName;
    }

    public double getRatePerKm() {
        return ratePerKm;
    }

    private void setRatePerKm(double ratePerKm) {
        if (ratePerKm < 0) throw new IllegalArgumentException("Rate cannot be negative");
        this.ratePerKm = ratePerKm;
    }

    public abstract double calculateFare(double distance);

    public void getVehicleDetails() {
        System.out.println("VehicleID: " + vehicleId + " | Driver: " + driverName + " | Rate/km: " + ratePerKm);
    }

    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    @Override
    public void updateLocation(String newLocation) {
        if (newLocation == null || newLocation.trim().isEmpty())
            throw new IllegalArgumentException("Location cannot be empty");
        currentLocation = newLocation;
    }
}

class RideCar extends RideVehicle {
    public RideCar(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance + 30; // base fare
    }
}

class RideBike extends RideVehicle {
    public RideBike(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance; // no base fare
    }
}

class RideAuto extends RideVehicle {
    public RideAuto(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance + 15; // small base fare
    }
}

public class Main8_RideHailingApp {
    public static void calculateRideFare(List<RideVehicle> vehicles, double distance) {
        System.out.println("---- Fare Calculation (Polymorphism) ----");
        for (RideVehicle v : vehicles) {
            v.getVehicleDetails();
            System.out.println("Location: " + v.getCurrentLocation());
            System.out.println("Distance: " + distance + " km | Fare: ₹" + v.calculateFare(distance));
            System.out.println("-----------------------------------");
        }
    }

    public static void main(String[] args) {
        List<RideVehicle> vehicles = new ArrayList<>();

        RideVehicle v1 = new RideCar("C101", "Ramesh", 15);
        RideVehicle v2 = new RideBike("B202", "Suresh", 10);
        RideVehicle v3 = new RideAuto("A303", "Mahesh", 12);

        v1.updateLocation("SRM Gate");
        v2.updateLocation("Potheri");
        v3.updateLocation("Guduvanchery");

        vehicles.add(v1);
        vehicles.add(v2);
        vehicles.add(v3);

        calculateRideFare(vehicles, 8.5);
    }
}
