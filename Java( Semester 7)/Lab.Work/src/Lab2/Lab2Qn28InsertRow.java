
package Lab2;
import java.sql.*;

public class Lab2Qn28InsertRow {
    public static void main(String[] args) {

        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/lab2db","root","");

            Statement st = con.createStatement();

            st.executeUpdate("INSERT INTO student VALUES(4,'Babin',22)");

            System.out.println("Inserted");

            con.close();

            System.out.println("Lab2, Priyanshu Shrestha, 23081040");

        } catch(Exception e){ e.printStackTrace(); }
    }
}
