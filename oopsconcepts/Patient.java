/*
7. Hospital Patient Management
Description: Design a system to manage patients in a hospital:
- Create an abstract class Patient with fields like patientId, name, and age.
- Add an abstract method calculateBill() and a concrete method getPatientDetails().
- Extend it into subclasses InPatient and OutPatient, implementing calculateBill() with different billing logic.
- Implement an interface MedicalRecord with methods addRecord() and viewRecords().
- Use encapsulation to protect sensitive patient data like diagnosis and medical history.
- Use polymorphism to handle different patient types and display their billing details dynamically.
*/

import java.util.*;

interface MedicalRecord {
    void addRecord(String record);
    void viewRecords();
}

abstract class Patient implements MedicalRecord {
    private String patientId;
    private String name;
    private int age;

    // ✅ Sensitive data (private)
    private String diagnosis;
    private List<String> history = new ArrayList<>();

    public Patient(String patientId, String name, int age) {
        setPatientId(patientId);
        setName(name);
        setAge(age);
    }

    public String getPatientId() {
        return patientId;
    }

    private void setPatientId(String patientId) {
        if (patientId == null || patientId.trim().isEmpty())
            throw new IllegalArgumentException("Patient ID cannot be empty");
        this.patientId = patientId;
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        if (name == null || name.trim().isEmpty())
            throw new IllegalArgumentException("Name cannot be empty");
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    private void setAge(int age) {
        if (age <= 0) throw new IllegalArgumentException("Age must be > 0");
        this.age = age;
    }

    // ✅ Controlled access to diagnosis
    public void setDiagnosis(String diagnosis) {
        if (diagnosis == null || diagnosis.trim().isEmpty())
            throw new IllegalArgumentException("Diagnosis cannot be empty");
        this.diagnosis = diagnosis;
    }

    public String getDiagnosisMasked() {
        return (diagnosis == null) ? "Not Set" : "Protected (Private)";
    }

    public abstract double calculateBill();

    public void getPatientDetails() {
        System.out.println("PatientID: " + patientId + " | Name: " + name + " | Age: " + age +
                " | Diagnosis: " + getDiagnosisMasked());
    }

    @Override
    public void addRecord(String record) {
        history.add(record);
    }

    @Override
    public void viewRecords() {
        System.out.println("Medical History Records: " + history);
    }
}

class InPatient extends Patient {
    private int daysAdmitted;
    private double dailyCharge;

    public InPatient(String id, String name, int age, int daysAdmitted, double dailyCharge) {
        super(id, name, age);
        this.daysAdmitted = daysAdmitted;
        this.dailyCharge = dailyCharge;
    }

    @Override
    public double calculateBill() {
        return daysAdmitted * dailyCharge;
    }
}

class OutPatient extends Patient {
    private double consultationFee;

    public OutPatient(String id, String name, int age, double consultationFee) {
        super(id, name, age);
        this.consultationFee = consultationFee;
    }

    @Override
    public double calculateBill() {
        return consultationFee;
    }
}

public class Main7_Hospital {
    public static void main(String[] args) {
        List<Patient> patients = new ArrayList<>();

        Patient p1 = new InPatient("P101", "Varun", 21, 4, 2000);
        p1.setDiagnosis("Fever");

        Patient p2 = new OutPatient("P102", "Rahul", 20, 500);
        p2.setDiagnosis("Cold");

        p1.addRecord("Admitted on Day 1");
        p1.addRecord("Given IV fluids");
        p2.addRecord("Doctor consultation done");

        patients.add(p1);
        patients.add(p2);

        System.out.println("---- Patient Bills (Polymorphism) ----");
        for (Patient p : patients) {
            p.getPatientDetails();
            System.out.println("Bill Amount: ₹" + p.calculateBill());
            p.viewRecords();
            System.out.println("----------------------------------");
        }
    }
}
