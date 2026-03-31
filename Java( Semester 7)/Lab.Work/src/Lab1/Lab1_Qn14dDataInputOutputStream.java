package Lab1;
import java.io.*;
import java.util.*;

public class Lab1_Qn14dDataInputOutputStream {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String filepath = "C:\\Users\\NITRO\\Desktop\\data.txt";

        try {
            System.out.print("Enter an integer to write to file: ");
            int num = sc.nextInt();

            // Write integer to file
            try (DataOutputStream d = new DataOutputStream(new FileOutputStream(filepath))) {
                d.writeInt(num);
            }

            // Read integer from file
            try (DataInputStream in = new DataInputStream(new FileInputStream(filepath))) {
                int readNum = in.readInt();
                System.out.println("Integer read from file: " + readNum);
            }

        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }
          System.out.println("\nLab1, Priyanshu Shrestha, 23081040");
    }
    
}
