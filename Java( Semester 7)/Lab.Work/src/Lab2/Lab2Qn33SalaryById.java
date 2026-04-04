package Lab2;

import java.sql.*;
import java.util.Scanner;

public class Lab2Qn33SalaryById {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            // Step 1: Connect to MySQL database
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/lab2db", "root", ""
            );

            // Step 2: Read employee ID from console
            System.out.print("Enter Employee ID: ");
            int empId = Integer.parseInt(sc.nextLine());

            // Step 3: Prepare SQL query with PreparedStatement
            PreparedStatement ps = con.prepareStatement(
                "SELECT * FROM salary WHERE emp_id = ?"
            );
            ps.setInt(1, empId);

            // Step 4: Execute query
            ResultSet rs = ps.executeQuery();

            // Step 5: Display the record
            if (rs.next()) {
                System.out.println("Employee ID: " + rs.getInt("emp_id"));
                System.out.println("Employee Name: " + rs.getString("emp_name"));
                System.out.println("Employee Salary: " + rs.getInt("emp_salary"));
            } else {
                System.out.println("No record found for Employee ID: " + empId);
            }

            // Step 6: Close connection
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}