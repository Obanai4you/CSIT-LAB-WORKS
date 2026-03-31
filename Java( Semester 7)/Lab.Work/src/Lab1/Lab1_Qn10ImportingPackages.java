package Lab1;
// Demonstrates importing packages in Java
// Fully qualified name example, single class import, and wildcard import
import java.util.Date; // single class import
import java.util.*;    // wildcard import

public class Lab1_Qn10ImportingPackages { 
     public static void main(String[] args) {
        // Fully qualified name
        java.util.Calendar cal = java.util.Calendar.getInstance();
        System.out.println("Calendar (fully qualified): " + cal.getTime());

        // Using single class import
        Date date = new Date();
        System.out.println("Date (imported class): " + date);

        // Using wildcard import
        java.util.Random rand = new Random();
        System.out.println("Random number (wildcard import): " + rand.nextInt(100));
        
        System.out.println("\nLab1,Priyanshu Shrestha,23081040");
     }
}
