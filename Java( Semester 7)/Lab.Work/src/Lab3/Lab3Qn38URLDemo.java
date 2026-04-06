
package Lab3;

import java.net.*;
import java.io.*;
public class Lab3Qn38URLDemo {
     public static void main(String[] args) {
        System.out.println("Lab4 - URL, URLConnection & InetAddress Demo");

        try {

            // -----------------------------------
            // (a) Different ways of creating URL & Parsing
            // -----------------------------------
            System.out.println("\n--- (a) URL Creation & Parsing ---");

            // Method 1: Using full URL string
            URL url1 = new URL("https://www.google.com/index.html");

            // Method 2: Using protocol, host, file
            URL url2 = new URL("https", "www.google.com", "/search");

            System.out.println("URL1: " + url1);
            System.out.println("Protocol: " + url1.getProtocol());
            System.out.println("Host: " + url1.getHost());
            System.out.println("Port: " + url1.getPort());
            System.out.println("File: " + url1.getFile());

            System.out.println("\nURL2: " + url2);


            // -----------------------------------
            // (b) Reading directly from URL
            // -----------------------------------
            System.out.println("\n--- (b) Reading Directly from URL ---");

            BufferedReader br = new BufferedReader(
                    new InputStreamReader(url1.openStream())
            );

            String line;
            int count = 0;

            while ((line = br.readLine()) != null && count < 5) {
                System.out.println(line);
                count++; // limit output
            }

            br.close();


            // -----------------------------------
            // (c) Reading from URLConnection
            // -----------------------------------
            System.out.println("\n--- (c) URLConnection ---");

            URLConnection conn = url1.openConnection();

            System.out.println("Content Type: " + conn.getContentType());
            System.out.println("Content Length: " + conn.getContentLength());
            System.out.println("Last Modified: " + conn.getLastModified());


            // -----------------------------------
            // (d) InetAddress Class
            // -----------------------------------
            System.out.println("\n--- (d) InetAddress ---");

            InetAddress ip = InetAddress.getByName("www.google.com");

            System.out.println("Host Name: " + ip.getHostName());
            System.out.println("IP Address: " + ip.getHostAddress());

            // Extra: Local host
            InetAddress local = InetAddress.getLocalHost();
            System.out.println("Local Host: " + local.getHostName());
            System.out.println("Local IP: " + local.getHostAddress());


        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}

