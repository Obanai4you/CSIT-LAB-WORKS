
package Lab1;
import java.io.*;

public class Lab1_Qn14cImage {
      public static void main(String[] args) {
        String source = "C:\\Users\\NITRO\\Desktop\\img1.png";
        String dest   = "C:\\Users\\NITRO\\Desktop\\img2.png";

        try (FileInputStream f1 = new FileInputStream(source);
             FileOutputStream f2 = new FileOutputStream(dest)) {

            int i;
            while ((i = f1.read()) != -1)
                f2.write(i);

            System.out.println("File copied successfully.");

        } catch (FileNotFoundException e) {
            System.out.println("Source file not found: " + source);
        } catch (IOException e) {
            System.out.println("Error during file copy: " + e.getMessage());
        }
          System.out.println("\nLab1, Priyanshu Shrestha, 23081040");
    }
}
