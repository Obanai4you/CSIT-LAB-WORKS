
package Lab2;

import java.sql.*;

public class Lab2Qn34ResultSetTypes {
    public static void main(String[] args) {

        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/lab2db","root","");

            // Scrollable & Updatable ResultSet
            Statement st = con.createStatement(
                ResultSet.TYPE_SCROLL_INSENSITIVE,
                ResultSet.CONCUR_UPDATABLE
            );

            // ---------- Scrollable ResultSet ----------
            ResultSet rs = st.executeQuery("SELECT * FROM student");

            System.out.println("Forward:");
            while(rs.next()){
                System.out.println(rs.getInt("id")+" "+rs.getString("name")+" "+rs.getInt("marks"));
            }

            System.out.println("Backward:");
            while(rs.previous()){
                System.out.println(rs.getInt("id")+" "+rs.getString("name")+" "+rs.getInt("marks"));
            }

            // ---------- Updatable ResultSet ----------
            rs.absolute(1); // move to first row
            rs.updateString("name","UpdatedName"); // update name
            rs.updateRow(); // commit update
            System.out.println("\nUpdated first row name to 'UpdatedName'.");

            // ---------- Multiple ResultSet ----------
            ResultSet rs2 = st.executeQuery("SELECT * FROM result");
            System.out.println("\nSecond Table (result):");
            while(rs2.next()){
                System.out.println(rs2.getInt("roll_no")+" "+rs2.getString("course_name")+" "+rs2.getInt("marks_obtained"));
            }

            con.close();
            System.out.println("\nLab3, Priyanshu Shrestha, 23081040");

        } catch(Exception e){ 
            e.printStackTrace(); 
        }
    }
}