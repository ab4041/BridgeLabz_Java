/*
Sample Program 7: Hospital Management System

Static:
- hospitalName
- getTotalPatients()

This:
- Initialize name, age, ailment

Final:
- patientID must be final

Instanceof:
- Validate object before displaying patient details
*/

class Patient {
    static String hospitalName = "Apollo Hospital";
    private static int totalPatients = 0;

    private String name;
    private int age;
    private String ailment;
    private final int patientID;

    public Patient(String name, int age, String ailment, int patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;
        totalPatients++;
    }

    public void display(Object obj) {
        if (obj instanceof Patient) {
            System.out.println(name + " | Age: " + age + " | Ailment: " + ailment);
        }
    }

    public static void getTotalPatients() {
        System.out.println("Total Patients: " + totalPatients);
    }
}

public class Main {
    public static void main(String[] args) {
        Patient p = new Patient("Varun", 21, "Fever", 501);
        p.display(p);
        Patient.getTotalPatients();
    }
}
