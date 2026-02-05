import java.util.*;

/*
Problem:
Sort Person objects by age using lambda
*/

class Person {
    String name;
    int age;
    double salary;

    Person(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
}

public class PersonSorting {

    public static void main(String[] args) {

        List<Person> people = List.of(
            new Person("Amit", 30, 50000),
            new Person("Ravi", 25, 60000),
            new Person("Neha", 35, 70000)
        );

        people.stream()
              .sorted(Comparator.comparingInt(p -> p.age))
              .forEach(p -> System.out.println(p.name + " - " + p.age));
    }
}
