package Lab1;
import java.io.*;

public class Lab1_Qn14iSerialization {
     public static void main(String[] args) {
        String filepath = "C:\\Users\\NITRO\\Desktop\\a.txt";

        try (ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream(filepath))) {
            A obj = new A();
            o.writeObject(obj);
            System.out.println("Object serialized successfully.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
         System.out.println("\nLab1, Priyanshu Shrestha, 23081040");
    }
      // Make A static and public inside the main class
    public static class A implements Serializable {
        int x = 10;
    }

}
