package Lab1;

import java.util.Scanner;

class ConstructorOverload {
    int a, b;

    // Default constructor
    ConstructorOverload() {
        a = 0;
        b = 0;
    }

    // Parameterized constructor
    ConstructorOverload(int x, int y) {
        a = x;
        b = y;
    }

    void display() {
        System.out.println("a = " + a + ", b = " + b);
    }
}

public class Lab1Qn4bConstructorOverloading {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Default constructor
        ConstructorOverload obj1 = new ConstructorOverload();

        // Parameterized constructor
        System.out.print("Enter values for a and b: ");
        int x = sc.nextInt();
        int y = sc.nextInt();

        ConstructorOverload obj2 = new ConstructorOverload(x, y);

        System.out.println("\nObject 1 (Default Constructor):");
        obj1.display();

        System.out.println("Object 2 (Parameterized Constructor):");
        obj2.display();

        // Footer
        System.out.println("\nLab1, Priyanshu Shrestha, 23081040");

        sc.close();
    }
}