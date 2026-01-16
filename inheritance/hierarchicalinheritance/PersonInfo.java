/*
Hybrid Inheritance (Simulating Multiple Inheritance) - Sample Problem 1: Restaurant Management System with Hybrid Inheritance
Since Java doesn’t support multiple inheritance directly, hybrid inheritance is typically achieved through interfaces.
Description: Model a restaurant system where Person is the superclass and Chef and Waiter are subclasses.
Both Chef and Waiter should implement a Worker interface that requires a performDuties() method.
Tasks:
1) Define a superclass Person with attributes like name and id.
2) Create an interface Worker with a method performDuties().
3) Define subclasses Chef and Waiter that inherit from Person and implement the Worker interface, each providing a unique implementation of performDuties().
Goal: Practice hybrid inheritance by combining inheritance and interfaces, giving multiple behaviors to the same objects.
*/

class PersonInfo {
    String name;
    int id;

    PersonInfo(String name, int id) {
        this.name = name;
        this.id = id;
    }
}

interface Worker {
    void performDuties();
}

class Chef extends PersonInfo implements Worker {
    Chef(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println(name + " (Chef) is preparing food.");
    }
}

class Waiter extends PersonInfo implements Worker {
    Waiter(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println(name + " (Waiter) is serving customers.");
    }
}

public class RestaurantDemo {
    public static void main(String[] args) {
        Worker w1 = new Chef("Karan", 1);
        Worker w2 = new Waiter("Ajay", 2);

        w1.performDuties();
        w2.performDuties();
    }
}
