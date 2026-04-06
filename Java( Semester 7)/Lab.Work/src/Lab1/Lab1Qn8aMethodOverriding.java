package Lab1;

import java.util.Scanner;

class Figure {
    void area() {
        System.out.println("Area not defined");
    }
}

class Rectangle extends Figure {
    double length, breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    void area() {
        System.out.println("Rectangle Area: " + (length * breadth));
    }
}

class Triangle extends Figure {
    double base, height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    void area() {
        System.out.println("Triangle Area: " + (0.5 * base * height));
    }
}

public class Lab1Qn8aMethodOverriding {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length: ");
        double l = sc.nextDouble();

        System.out.print("Enter breadth: ");
        double b = sc.nextDouble();

        Figure f1 = new Rectangle(l, b);

        System.out.print("Enter base: ");
        double base = sc.nextDouble();

        System.out.print("Enter height: ");
        double h = sc.nextDouble();

        Figure f2 = new Triangle(base, h);

        f1.area();
        f2.area();

        sc.close();
    }
}