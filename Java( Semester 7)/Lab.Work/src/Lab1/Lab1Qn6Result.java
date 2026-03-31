package Lab1;

import java.util.Scanner;

// Class 1: Student
class Student {
    int roll_no;

    void readRoll(Scanner sc) {
        System.out.print("Enter roll number: ");
        roll_no = sc.nextInt();
    }

    void displayRoll() {
        System.out.println("Roll Number: " + roll_no);
    }
}

// Class 2: Test (inherits Student)
class Test extends Student {
    int mark1, mark2;

    void readMarks(Scanner sc) {
        System.out.print("Enter marks of subject 1: ");
        mark1 = sc.nextInt();

        System.out.print("Enter marks of subject 2: ");
        mark2 = sc.nextInt();
    }

    void displayMarks() {
        System.out.println("Marks of Subject 1: " + mark1);
        System.out.println("Marks of Subject 2: " + mark2);
    }
}

// Class 3: Result (inherits Test)
public class Lab1Qn6Result extends Test {
    int total;

    void calculateTotal() {
        total = mark1 + mark2;
    }

    void displayResult() {
        displayRoll();
        displayMarks();
        System.out.println("Total Marks: " + total);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Create object
        Lab1Qn6Result r = new Lab1Qn6Result();

        // Method calls
        r.readRoll(sc);
        r.readMarks(sc);
        r.calculateTotal();
        r.displayResult();

        // Footer
        System.out.println("\nLab1, Priyanshu Shrestha, 23081040");

        sc.close();
    }
}