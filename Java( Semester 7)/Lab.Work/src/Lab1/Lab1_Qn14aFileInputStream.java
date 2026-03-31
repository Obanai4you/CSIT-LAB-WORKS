package Lab1;
import java.io.*;

public class Lab1_Qn14aFileInputStream {
    public static void main(String[] args) {
        try (FileInputStream f = new FileInputStream("C:\\Users\\NITRO\\Desktop\\Lab1.txt.txt")) {

            int i;
            while ((i = f.read()) != -1) {
                System.out.print((char) i);
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found. Please check the path.");
        } catch (IOException e) {
            System.out.println("Error reading file.");
        }

        System.out.println("\nLab1, Priyanshu Shrestha, 23081040");
    }
}