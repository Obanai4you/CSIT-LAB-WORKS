
package Lab3;
import java.io.*;
import java.net.*;


public class Lab3Qn39_Client {
    public static void main(String[] args) {

        System.out.println("Lab3, Priyanshu Shrestha, 23081040");

        try {
            Socket s = new Socket("localhost",5000);

            PrintWriter out = new PrintWriter(s.getOutputStream(), true);
            BufferedReader br = new BufferedReader(
                new InputStreamReader(s.getInputStream()));

            out.println("Hello Server");

            System.out.println("Server: " + br.readLine());

            s.close();

        } catch(Exception e){
            System.out.println(e);
        }
    }
}
