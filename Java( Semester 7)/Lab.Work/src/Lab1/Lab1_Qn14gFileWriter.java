
package Lab1;
import java.io.*;
import java.util.*;


public class Lab1_Qn14gFileWriter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String filepath = "C:\\Users\\NITRO\\Desktop\\data.txt";

        try (FileWriter f = new FileWriter(filepath)) {
            System.out.print("Enter text to write to file: ");
            String text = sc.nextLine();
            f.write(text);
            System.out.println("Text written to file successfully.");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
         System.out.println("\nLab1, Priyanshu Shrestha, 23081040");
    }
}
