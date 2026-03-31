package Lab1;
import java.util.*;

class MyException extends Exception {
    MyException(String m) {
        super(m);
    }
}
public class Lab1_Qn12fCustomException {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter a number: ");
            int x = sc.nextInt();

            if (x < 0)
                throw new MyException("Invalid number");

            System.out.println("Value: " + x);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("\nLab1,Priyanshu Shrestha,23081040");
     }
}
