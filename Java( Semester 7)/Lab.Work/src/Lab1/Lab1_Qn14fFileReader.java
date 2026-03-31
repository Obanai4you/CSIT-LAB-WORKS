
package Lab1;
import java.io.*;

public class Lab1_Qn14fFileReader {
     public static void main(String[] args) {
        String filepath = "C:\\Users\\NITRO\\Desktop\\data.txt";

        try (FileReader f = new FileReader(filepath)) {
            int i;
            while ((i = f.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filepath);
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
     System.out.println("\nLab1, Priyanshu Shrestha, 23081040");
    }
}
