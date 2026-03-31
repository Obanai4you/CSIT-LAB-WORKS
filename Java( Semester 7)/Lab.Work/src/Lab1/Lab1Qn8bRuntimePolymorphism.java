package Lab1;

import java.util.Scanner;

// Base class
class Shape {
    double area;

    void calculateArea() {
        System.out.println("Area not defined");
    }
}

// Derived class: Rectangle
class Rectangle extends Shape {
    double length, breadth;

    Rectangle(double l, double b) {
        length = l;
        breadth = b;
    }

    @Override
    void calculateArea() {
        area = length * breadth;
        System.out.println("Area of Rectangle: " + area);
    }
}

// Derived class: Triangle
class Triangle extends Shape {
    double base, height;

    Triangle(double b, double h) {
        base = b;
        height = h;
    }

    @Override
    void calculateArea() {
        area = 0.5 * base * height;
        System.out.println("Area of Triangle: " + area);
    }
}

// Main class
public class Lab1Qn8bRuntimePolymorphism {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Rectangle input
        System.out.print("Enter length and breadth of rectangle: ");
        double l = sc.nextDouble();
        double b = sc.nextDouble();

        // Triangle input
        System.out.print("Enter base and height of triangle: ");
        double base = sc.nextDouble();
        double height = sc.nextDouble();

        // Runtime polymorphism
        Shape s;

        s = new Rectangle(l, b);  // Upcasting
        s.calculateArea();

        s = new Triangle(base, height);  // Upcasting
        s.calculateArea();

        // Footer
        System.out.println("\nLab1, Priyanshu Shrestha, 23081040");

        sc.close();
    }
}