package Lab3;

import java.net.*;

public class Lab3Qn40_UDPServer {
    public static void main(String[] args) {

        System.out.println("Lab3,Priyanshu Shrestha, 23081040");

        try {
            // Create DatagramSocket at port 5000
            DatagramSocket ds = new DatagramSocket(5000);
            System.out.println("Server is running and waiting for client...");

            // Buffer to receive data
            byte[] receive = new byte[1024];

            // Create packet to receive data
            DatagramPacket dp = new DatagramPacket(receive, receive.length);

            // Receive message
            ds.receive(dp);

            // Convert byte data to string
            String msg = new String(dp.getData(), 0, dp.getLength());

            System.out.println("Client Message: " + msg);

            // Close socket
            ds.close();

        } catch(Exception e){
            System.out.println("Error: " + e);
        }
    }
}