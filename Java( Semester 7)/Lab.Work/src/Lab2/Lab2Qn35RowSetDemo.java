package Lab2;

import java.sql.*;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;
import javax.sql.rowset.CachedRowSet;

public class Lab2Qn35RowSetDemo {
    public static void main(String[] args) {
        try {
            String url = "jdbc:mysql://localhost:3306/lab2db";
            String user = "root";
            String pass = "";

            // ---------------------- JdbcRowSet ----------------------
            System.out.println("===== JdbcRowSet Demo =====");
            JdbcRowSet jrs = RowSetProvider.newFactory().createJdbcRowSet();
            jrs.setUrl(url);
            jrs.setUsername(user);
            jrs.setPassword(pass);
            jrs.setCommand("SELECT * FROM student");
            jrs.execute();

            System.out.println("Forward traversal using JdbcRowSet:");
            while(jrs.next()) {
                System.out.println(jrs.getInt("id")+" "+jrs.getString("name")+" "+jrs.getInt("marks"));
            }

            System.out.println("\nUpdating first row using JdbcRowSet...");
            jrs.beforeFirst();
            if(jrs.next()) {
                jrs.updateString("name", "JdbcRowSetUpdated");
                jrs.updateRow();
            }

            jrs.beforeFirst();
            System.out.println("After update:");
            while(jrs.next()) {
                System.out.println(jrs.getInt("id")+" "+jrs.getString("name")+" "+jrs.getInt("marks"));
            }

            // ---------------------- CachedRowSet ----------------------
            System.out.println("\n===== CachedRowSet Demo =====");
            CachedRowSet crs = RowSetProvider.newFactory().createCachedRowSet();
            crs.setUrl(url);
            crs.setUsername(user);
            crs.setPassword(pass);
            crs.setCommand("SELECT * FROM student");
            crs.execute();

            System.out.println("Forward traversal using CachedRowSet:");
            while(crs.next()) {
                System.out.println(crs.getInt("id")+" "+crs.getString("name")+" "+crs.getInt("marks"));
            }

            System.out.println("\nModifying first row in CachedRowSet (offline)...");
            crs.beforeFirst();
            if(crs.next()) {
                crs.updateString("name", "CachedRowSetUpdated");
                crs.updateRow();
            }

            // Push changes back to database using a separate connection
            Connection conAccept = DriverManager.getConnection(url, user, pass);
            conAccept.setAutoCommit(false);   // Turn off autocommit
            crs.acceptChanges(conAccept);     // Sync changes
            conAccept.close();

            System.out.println("Final student table after CachedRowSet update:");
            displayStudentTable(url, user, pass);

            System.out.println("\nLab2, Priyanshu Shrestha, 23081040");

        } catch(Exception e){
            e.printStackTrace();
        }
    }

    // ---------------------- Helper method to display table ----------------------
    public static void displayStudentTable(String url, String user, String pass) throws SQLException {
        Connection con = DriverManager.getConnection(url, user, pass);
        PreparedStatement ps = con.prepareStatement("SELECT * FROM student");
        ResultSet rs = ps.executeQuery();

        System.out.println("\nID\tName\tMarks");
        System.out.println("------------------------");
        while(rs.next()) {
            System.out.println(rs.getInt("id")+"\t"+rs.getString("name")+"\t"+rs.getInt("marks"));
        }
        con.close();
    }
}