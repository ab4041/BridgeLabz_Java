/*
3. Vehicle Rental System
Description: Design a system to manage vehicle rentals:
- Define an abstract class Vehicle with fields like vehicleNumber, type, and rentalRate.
- Add an abstract method calculateRentalCost(int days).
- Create subclasses Car, Bike, and Truck with specific implementations of calculateRentalCost().
- Use an interface Insurable with methods calculateInsurance() and getInsuranceDetails().
- Apply encapsulation to restrict access to sensitive details like insurance policy numbers.
- Demonstrate polymorphism by iterating over a list of vehicles and calculating rental and insurance costs for each.
*/

import java.util.*;

interface Insurable {
    double calculateInsurance(int days);
    String getInsuranceDetails();
}

abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRatePerDay;

    // ✅ sensitive field (keep private)
    private String insurancePolicyNumber;

    public Vehicle(String vehicleNumber, String type, double rentalRatePerDay, String policyNo) {
        setVehicleNumber(vehicleNumber);
        setType(type);
        setRentalRatePerDay(rentalRatePerDay);
        setInsurancePolicyNumber(policyNo);
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        if (vehicleNumber == null || vehicleNumber.trim().isEmpty())
            throw new IllegalArgumentException("Vehicle number cannot be empty");
        this.vehicleNumber = vehicleNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        if (type == null || type.trim().isEmpty())
            throw new IllegalArgumentException("Type cannot be empty");
        this.type = type;
    }

    public double getRentalRatePerDay() {
        return rentalRatePerDay;
    }

    public void setRentalRatePerDay(double rentalRatePerDay) {
        if (rentalRatePerDay < 0) throw new IllegalArgumentException("Rate cannot be negative");
        this.rentalRatePerDay = rentalRatePerDay;
    }

    // ✅ Only controlled access
    private void setInsurancePolicyNumber(String policyNo) {
        if (policyNo == null || policyNo.trim().isEmpty())
            throw new IllegalArgumentException("Policy number cannot be empty");
        this.insurancePolicyNumber = policyNo;
    }

    public String getMaskedPolicyNumber() {
        return "XXXX-XXXX-" + insurancePolicyNumber.substring(Math.max(0, insurancePolicyNumber.length() - 4));
    }

    public abstract double calculateRentalCost(int days);

    public void displayVehicle() {
        System.out.println("Vehicle: " + vehicleNumber + " | Type: " + type + " | Rate/day: " + rentalRatePerDay +
                " | Policy: " + getMaskedPolicyNumber());
    }
}

class Car extends Vehicle implements Insurable {
    public Car(String vehicleNumber, double rate, String policyNo) {
        super(vehicleNumber, "Car", rate, policyNo);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRatePerDay() * days;
    }

    @Override
    public double calculateInsurance(int days) {
        return 150 * days; // fixed insurance per day
    }

    @Override
    public String getInsuranceDetails() {
        return "Car Insurance: ₹150/day";
    }
}

class Bike extends Vehicle implements Insurable {
    public Bike(String vehicleNumber, double rate, String policyNo) {
        super(vehicleNumber, "Bike", rate, policyNo);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRatePerDay() * days;
    }

    @Override
    public double calculateInsurance(int days) {
        return 80 * days;
    }

    @Override
    public String getInsuranceDetails() {
        return "Bike Insurance: ₹80/day";
    }
}

class Truck extends Vehicle implements Insurable {
    public Truck(String vehicleNumber, double rate, String policyNo) {
        super(vehicleNumber, "Truck", rate, policyNo);
    }

    @Override
    public double calculateRentalCost(int days) {
        return (getRentalRatePerDay() * days) + 500; // extra base charge
    }

    @Override
    public double calculateInsurance(int days) {
        return 250 * days;
    }

    @Override
    public String getInsuranceDetails() {
        return "Truck Insurance: ₹250/day";
    }
}

public class Main3_VehicleRental {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(new Car("TN09CA1111", 1200, "POLCAR9999"));
        vehicles.add(new Bike("TN10BI2222", 500, "POLBIKE8888"));
        vehicles.add(new Truck("TN11TR3333", 2500, "POLTRUCK7777"));

        int days = 3;

        System.out.println("---- Vehicle Rental Cost Calculation ----");
        for (Vehicle v : vehicles) {
            v.displayVehicle();

            double rentalCost = v.calculateRentalCost(days);
            double insuranceCost = 0;

            if (v instanceof Insurable) {
                insuranceCost = ((Insurable) v).calculateInsurance(days);
                System.out.println(((Insurable) v).getInsuranceDetails());
            }

            System.out.println("Rental Cost (" + days + " days): ₹" + rentalCost);
            System.out.println("Insurance Cost: ₹" + insuranceCost);
            System.out.println("----------------------------------");
        }
    }
}
