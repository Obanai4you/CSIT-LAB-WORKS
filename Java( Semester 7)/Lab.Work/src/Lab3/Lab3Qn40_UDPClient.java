package Lab3;

import java.net.*;

public class Lab3Qn40_UDPClient {
    public static void main(String[] args) {

        try {
            DatagramSocket ds = new DatagramSocket();

            String message = "Hello from Client!";
            byte[] send = message.getBytes();

            InetAddress ip = InetAddress.getByName("localhost");

            DatagramPacket dp = new DatagramPacket(send, send.length, ip, 5000);

            ds.send(dp);

            System.out.println("Message sent to server.");

            ds.close();

        } catch(Exception e){
            System.out.println("Error: " + e);
        }
    }
}