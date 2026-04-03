
package Lab2;


import java.sql.*;

public class Lab2Qn27DisplayAllData {
        public static void main(String[] args) {

        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/lab2db","root","");

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM student");

            while(rs.next()){
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
            }

            con.close();

            System.out.println("Lab2, Priyanshu, Shrestha");

        } catch(Exception e){ e.printStackTrace(); }
    }
}

