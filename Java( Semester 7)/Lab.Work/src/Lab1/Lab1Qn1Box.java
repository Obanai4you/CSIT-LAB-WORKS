package Lab1;

import java.util.Scanner;

class Box {
    double length, breadth, height;

    void read() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        length = sc.nextDouble();
        System.out.print("Enter breadth: ");
        breadth = sc.nextDouble();
        System.out.print("Enter height: ");
        height = sc.nextDouble();
    }

    void display() {
        System.out.println("Length: " + length);
        System.out.println("Breadth: " + breadth);
        System.out.println("Height: " + height);
        System.out.println("Volume: " + (length * breadth * height));
    }
}

public class Lab1Qn1Box {
    public static void main(String[] args) {
        Box b1 = new Box();
        Box b2 = new Box();

        System.out.println("Enter details for Box 1:");
        b1.read();

        System.out.println("Enter details for Box 2:");
        b2.read();

        System.out.println("\nBox 1 Details:");
        b1.display();

        System.out.println("\nBox 2 Details:");
        b2.display();

        // Footer
        System.out.println("\nLab No.: 1, Priyanshu Shrestha, 23081040");

    }
}