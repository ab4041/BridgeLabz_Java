/*
Problem Statement:
Create a Person class with a copy constructor that clones another person's attributes.
*/

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    public Person(Person p) {
        this.name = p.name;
        this.age = p.age;
    }

    public void display() {
        System.out.println(name + " - " + age);
    }
}

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Varun", 21);
        Person p2 = new Person(p1);

        p2.display();
    }
}
