/*
Sample Program 6: Vehicle Registration System

Static:
- registrationFee
- updateRegistrationFee()

This:
- Initialize ownerName, vehicleType, registrationNumber

Final:
- registrationNumber must be final

Instanceof:
- Validate object before displaying registration details
*/

class Vehicle {
    static double registrationFee = 2500;

    private String ownerName;
    private String vehicleType;
    private final String registrationNumber;

    public Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    public void display(Object obj) {
        if (obj instanceof Vehicle) {
            System.out.println(ownerName + " | " + vehicleType + " | Reg No: " + registrationNumber);
        }
    }

    public static void updateRegistrationFee(double fee) {
        registrationFee = fee;
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle v = new Vehicle("Varun", "Car", "TN01AB1234");
        v.display(v);
    }
}
