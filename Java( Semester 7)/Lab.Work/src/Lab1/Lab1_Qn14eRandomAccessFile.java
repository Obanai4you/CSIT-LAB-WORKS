
package Lab1;
import java.io.*;
import java.util.*;

public class Lab1_Qn14eRandomAccessFile {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String filepath = "C:\\Users\\NITRO\\Desktop\\data.txt";

        try (RandomAccessFile r = new RandomAccessFile(filepath, "rw")) {
            System.out.print("Enter a string to write in file: ");
            String text = sc.nextLine();

            // Write string to file
            r.writeUTF(text);

            // Move file pointer to start
            r.seek(0);

            // Read string back
            String readText = r.readUTF();
            System.out.println("String read from file: " + readText);

        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }  
        System.out.println("\nLab1, Priyanshu Shrestha, 23081040");
    }
}
     
