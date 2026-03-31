package Lab1;
import java.io.*;
import java.util.*;


public class Lab1_Qn14bFileOutputStream {
     public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);
             FileOutputStream f = new FileOutputStream("C:\\Users\\NITRO\\Desktop\\Lab1.txt.txt")) {

            System.out.print("Enter text to write in file: ");
            String text = sc.nextLine();

            f.write(text.getBytes());
            System.out.println("Data written to file successfully.");

        } catch (IOException e) {
            System.out.println("Error writing to file.");
        }
         System.out.println("\nLab1, Priyanshu Shrestha, 23081040");
    }
    
}
