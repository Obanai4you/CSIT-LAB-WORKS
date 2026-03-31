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

    @Override
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

    @Override
    void area() {
        System.out.println("Triangle Area: " + (0.5 * base * height));
    }
}


public class Lab1Qn8aMethodOverriding {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input for Rectangle
        System.out.print("Enter length of rectangle: ");
        double length = sc.nextDouble();

        System.out.print("Enter breadth of rectangle: ");
        double breadth = sc.nextDouble();

        Figure f1 = new Rectangle(length, breadth);

        // Input for Triangle
        System.out.print("Enter base of triangle: ");
        double base = sc.nextDouble();

        System.out.print("Enter height of triangle: ");
        double height = sc.nextDouble();

        Figure f2 = new Triangle(base, height);

        // Method overriding demonstration
        f1.area();
        f2.area();
         // Footer
        System.out.println("\nLab1,Priyanshu Shrestha,23081040");
       }
}
