package Lab1;
import java.util.*;

public class Lab1_Qn12cNestedTry {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        try {
            if (age < 18)
                throw new Exception("Not eligible");
            System.out.println("Eligible");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("\nLab1,Priyanshu Shrestha,23081040");
     }
   
}
