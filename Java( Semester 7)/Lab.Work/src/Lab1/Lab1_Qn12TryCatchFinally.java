package Lab1;

import java.util.*;

public class Lab1_Qn12TryCatchFinally {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter 1st number: ");
            int a = sc.nextInt();

            System.out.print("Enter 2nd number: ");
            int b = sc.nextInt();

            System.out.println("Result: " + (a / b));
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        } catch (Exception e) {
            System.out.println("Invalid input");
        } finally {
            System.out.println("Finally block");
        }
        System.out.println("\nLab1,Priyanshu Shrestha,23081040");
     }
    
}
