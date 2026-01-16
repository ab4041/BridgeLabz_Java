/*
Assisted Problem: Animal Hierarchy
Description: Create a hierarchy where Animal is the superclass, and Dog, Cat, and Bird are subclasses. Each subclass has a unique behavior.
Tasks:
1) Define a superclass Animal with attributes name and age, and a method makeSound().
2) Define subclasses Dog, Cat, and Bird, each with a unique implementation of makeSound().
Goal: Learn basic inheritance, method overriding, and polymorphism with simple classes.
*/

class Animal {
    // Common attributes for all animals
    String name;
    int age;

    // Constructor to initialize common attributes
    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to be overridden by subclasses
    void makeSound() {
        System.out.println("Animal makes a sound...");
    }
}

// Dog is-a Animal
class Dog extends Animal {
    Dog(String name, int age) {
        super(name, age); // Calling superclass constructor
    }

    @Override
    void makeSound() {
        System.out.println(name + " says: Woof Woof!");
    }
}

// Cat is-a Animal
class Cat extends Animal {
    Cat(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println(name + " says: Meow Meow!");
    }
}

// Bird is-a Animal
class Bird extends Animal {
    Bird(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println(name + " says: Tweet Tweet!");
    }
}

public class AnimalHierarchyDemo {
    public static void main(String[] args) {
        // Polymorphism: Animal reference pointing to subclass objects
        Animal a1 = new Dog("Bruno", 3);
        Animal a2 = new Cat("Kitty", 2);
        Animal a3 = new Bird("Rio", 1);

        a1.makeSound();
        a2.makeSound();
        a3.makeSound();
    }
}
