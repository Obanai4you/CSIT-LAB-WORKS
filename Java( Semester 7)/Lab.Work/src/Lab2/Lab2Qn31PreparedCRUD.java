package Lab2;

import java.sql.*;

public class Lab2Qn31PreparedCRUD {
    public static void main(String[] args) {

        try {
            // Step 1: Connect to MySQL database (localhost, no password)
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/lab2db", "root", ""
            );

            // ---------------------- DELETE ANOTHER ROW ----------------------
            // Delete roll_no 104 to keep table clean
            System.out.println("Deleting roll_no 104 to clean up table...");
            PreparedStatement psDeleteOld = con.prepareStatement(
                "DELETE FROM result WHERE roll_no=?"
            );
            psDeleteOld.setInt(1, 104);
            psDeleteOld.executeUpdate();
            System.out.println("Record with roll_no 104 deleted.\n");

            // Display table after cleanup
            displayTable(con);

            // ---------------------- INSERT ----------------------
            System.out.println("\nInserting a new record (roll_no 106)...");
            PreparedStatement psInsert = con.prepareStatement(
                "INSERT INTO result VALUES(?,?,?)"
            );
            psInsert.setInt(1, 106); // roll_no
            psInsert.setString(2, "Computer Science"); // course_name
            psInsert.setInt(3, 92); // marks_obtained
            psInsert.executeUpdate();
            System.out.println("Record inserted successfully.\n");

            // Display table after insert
            displayTable(con);

            // ---------------------- UPDATE ----------------------
            System.out.println("\nUpdating the newly inserted record (roll_no 106)...");
            PreparedStatement psUpdate = con.prepareStatement(
                "UPDATE result SET marks_obtained=? WHERE roll_no=?"
            );
            psUpdate.setInt(1, 95); // new marks
            psUpdate.setInt(2, 106); // roll_no to update
            psUpdate.executeUpdate();
            System.out.println("Record updated successfully.\n");

            // Display table after update
            displayTable(con);

            // ---------------------- DELETE ----------------------
            System.out.println("\nDeleting the record (roll_no 106)...");
            PreparedStatement psDelete = con.prepareStatement(
                "DELETE FROM result WHERE roll_no=?"
            );
            psDelete.setInt(1, 106); // roll_no to delete
            psDelete.executeUpdate();
            System.out.println("Record deleted successfully.\n");

            // Display table after delete
            displayTable(con);

            // Close connection
            con.close();
            System.out.println("Lab3, Priyanshu Shrestha, 23081040");
        } catch(Exception e){
            e.printStackTrace();
        }
    }

    // ---------------------- Method to display all records ----------------------
    public static void displayTable(Connection con) throws SQLException {
        PreparedStatement psSelect = con.prepareStatement("SELECT * FROM result");
        ResultSet rs = psSelect.executeQuery();

        System.out.println("Current records in result table:");
        System.out.println("Roll No\tCourse Name\tMarks Obtained");
        System.out.println("---------------------------------------");

        while(rs.next()){
            System.out.println(
                rs.getInt("roll_no") + "\t" +
                rs.getString("course_name") + "\t\t" +
                rs.getInt("marks_obtained")
            );
            
        }
    }
}