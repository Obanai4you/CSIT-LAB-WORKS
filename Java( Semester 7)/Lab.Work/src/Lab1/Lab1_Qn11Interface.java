
package Lab1;

import java.util.Scanner;
import Lab1.Shape;

interface Shape {
    double area(double x, double y);
    double perimeter(double x, double y);
}

class Rectangle implements Shape {

    // Explicit default constructor
    public Rectangle() {
    }

    @Override
    public double area(double l, double b) {
        return l * b;
    }

    @Override
    public double perimeter(double l, double b) {
        return 2 * (l + b);
    }
}

public class Lab1_Qn11Interface {    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length: ");
        double length = sc.nextDouble();

        System.out.print("Enter breadth: ");
        double breadth = sc.nextDouble();

        Rectangle r = new Rectangle();
        System.out.println("Area: " + r.area(length, breadth));
        System.out.println("Perimeter: " + r.perimeter(length, breadth));
        
         System.out.println("\nLab1,Priyanshu Shrestha,23081040");
     }
    
}
