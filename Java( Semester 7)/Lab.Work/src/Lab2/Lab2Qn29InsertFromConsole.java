package Lab2;

import java.sql.*;
import java.util.Scanner;

public class Lab2Qn29InsertFromConsole {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            // Connect to MySQL
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/lab2db", "root", "");

            Statement st = con.createStatement();

            System.out.print("Enter ID: ");
            int id = Integer.parseInt(sc.nextLine()); // safe integer input

            System.out.print("Enter Name: ");
            String name = sc.nextLine(); // supports full names with spaces

            System.out.print("Enter Marks: ");
            int marks = Integer.parseInt(sc.nextLine()); // safe integer input

            // Insert query
            String query = "INSERT INTO student VALUES(" + id + ", '" + name + "', " + marks + ")";
            st.executeUpdate(query);

            System.out.println("Inserted Successfully");

            con.close();
            System.out.println("Lab3, Priyanshu Shrestha, 23081040");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}