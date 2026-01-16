/*
Single Inheritance - Sample Problem 2: Smart Home Devices
Description: Create a hierarchy for a smart home system where Device is the superclass and Thermostat is a subclass.
Tasks:
1) Define a superclass Device with attributes like deviceId and status.
2) Create a subclass Thermostat with additional attributes like temperatureSetting.
3) Implement a method displayStatus() to show each device's current settings.
Goal: Understand single inheritance by adding specific attributes to a subclass, keeping the superclass general.
*/

class Device {
    String deviceId;
    String status; // ON / OFF

    Device(String deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }
}

class Thermostat extends Device {
    double temperatureSetting;

    Thermostat(String deviceId, String status, double temperatureSetting) {
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
    }

    void displayStatus() {
        System.out.println("Device ID: " + deviceId);
        System.out.println("Status: " + status);
        System.out.println("Temperature Setting: " + temperatureSetting + "°C");
    }
}

public class SmartHomeDemo {
    public static void main(String[] args) {
        Thermostat t = new Thermostat("TH-101", "ON", 24.5);
        t.displayStatus();
    }
}
