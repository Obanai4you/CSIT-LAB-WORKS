
package Lab1;
import java.util.*;


public class Lab1_Qn12eThrows {
    static void show(int x) throws Exception {
        if (x < 0)
            throw new Exception("Negative value");
        System.out.println("Value: " + x);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter a number: ");
            show(sc.nextInt());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
         System.out.println("\nLab1,Priyanshu Shrestha,23081040");
     }
    
}
