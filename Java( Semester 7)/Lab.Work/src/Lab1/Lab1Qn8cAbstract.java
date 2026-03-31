package Lab1;

// Abstract class
abstract class Vehicle {
    abstract void start();
}

// Car class extends Vehicle
class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car starts with key");
    }
}

// Bike class extends Vehicle
class Bike extends Vehicle {
    @Override
    void start() {
        System.out.println("Bike starts with kick");
    }
}

// Main class
public class Lab1Qn8cAbstract {
    public static void main(String[] args) {

        Vehicle v;

        v = new Car();
        v.start(); // runtime polymorphism

        v = new Bike();
        v.start(); // runtime polymorphism

        System.out.println("\nLab1, Priyanshu Shrestha, 23081040");
    }
}