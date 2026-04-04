package Lab2;

import java.sql.*;
import java.util.Scanner;

public class Lab2Qn30DisplayAllRecords {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            // Ask the user for Roll No
            System.out.print("Enter Roll No: ");
            int roll = Integer.parseInt(sc.nextLine()); // safer than nextInt()

            // Connect to MySQL on localhost, no password (adjust if you have one)
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/lab2db", "root", ""
            );

            Statement st = con.createStatement();

            // Execute query to fetch the record for the given roll number
            ResultSet rs = st.executeQuery(
                "SELECT * FROM result WHERE roll_no=" + roll
            );

            // Check if record exists
            boolean found = false;
            while(rs.next()) {
                System.out.println(
                    rs.getInt("roll_no") + " " +
                    rs.getString("course_name") + " " +
                    rs.getInt("marks_obtained")
                );
                found = true;
            }

            if (!found) {
                System.out.println("No record found for Roll No: " + roll);
            }

            // Close connection
            con.close();
            System.out.println("Lab3, Priyanshu Shrestha, 23081040");

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}