package Lab2;

import java.sql.*;
import java.util.Scanner;

public class Lab2Qn32InsertFromConsole {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            // Step 1: Connect to MySQL database
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/lab2db", "root", ""
            );

            // Step 2: Prepare the insert statement
            PreparedStatement psInsert = con.prepareStatement(
                "INSERT INTO result VALUES(?,?,?)"
            );

            boolean more = true;

            while (more) {
                // Take input from user
                System.out.print("Enter Roll No: ");
                int rollNo = Integer.parseInt(sc.nextLine());

                System.out.print("Enter Course Name: ");
                String courseName = sc.nextLine();

                System.out.print("Enter Marks Obtained: ");
                int marks = Integer.parseInt(sc.nextLine());

                // Set values and execute insert
                psInsert.setInt(1, rollNo);
                psInsert.setString(2, courseName);
                psInsert.setInt(3, marks);
                psInsert.executeUpdate();

                System.out.println("Record inserted successfully!\n");

                // Ask user if they want to insert another record
                System.out.print("Do you want to add another record? (y/n): ");
                String ans = sc.nextLine().trim().toLowerCase();
                if (!ans.equals("y")) {
                    more = false;
                }
            }

            // Optional: display all records after insertion
            System.out.println("\nAll records in the table:");
            displayTable(con);

            // Close connection
            con.close();

            System.out.println("\nLab2,Priyanshu Shrestha, 23081040");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Method to display all records
    public static void displayTable(Connection con) throws SQLException {
        PreparedStatement psSelect = con.prepareStatement("SELECT * FROM result");
        ResultSet rs = psSelect.executeQuery();

        System.out.println("Roll No\tCourse Name\tMarks Obtained");
        System.out.println("---------------------------------------");

        while (rs.next()) {
            System.out.println(
                    rs.getInt("roll_no") + "\t" +
                    rs.getString("course_name") + "\t\t" +
                    rs.getInt("marks_obtained")
            );
        }
    }
}