import java.io.*;
import java.util.*;

/*
4. Serialization - Save and Retrieve an Object

Problem Statement:
Store and retrieve a list of employees using serialization.
*/

class Employee implements Serializable {
    int id;
    String name;
    String department;
    double salary;

    Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
}

public class EmployeeSerialization {

    public static void main(String[] args) {

        List<Employee> employees = List.of(
                new Employee(1, "Varun", "IT", 50000),
                new Employee(2, "Amit", "HR", 45000)
        );

        // Serialization
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("employees.dat"))) {
            oos.writeObject(employees);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialization
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("employees.dat"))) {
            List<Employee> list = (List<Employee>) ois.readObject();
            list.forEach(e -> System.out.println(e.name + " " + e.department));
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
