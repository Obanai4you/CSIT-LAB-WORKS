
package Lab1;
import java.io.*;

public class Lab1_Qn14hKeywordToFile {
     public static void main(String[] args) {
        String filepath = "C:\\Users\\NITRO\\Desktop\\a.txt";

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             FileWriter f = new FileWriter(filepath)) {

            System.out.print("Enter text to write to file: ");
            String line = br.readLine();
            f.write(line);
            System.out.println("Text written to file successfully.");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }  
        System.out.println("\nLab1, Priyanshu Shrestha, 23081040");
    }
}
