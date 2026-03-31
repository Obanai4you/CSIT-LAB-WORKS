package Lab2;

import java.sql.*;

public class CreateUsersTable {

    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/java",
                "root",
                ""   
            );

            String sql = "CREATE TABLE IF NOT EXISTS users ("
                    + "id INT AUTO_INCREMENT PRIMARY KEY,"
                    + "name VARCHAR(100) NOT NULL,"
                    + "email VARCHAR(100) NOT NULL,"
                    + "password VARCHAR(50) NOT NULL,"
                    + "gender VARCHAR(10) NOT NULL"
                    + ")";

            Statement stmt = con.createStatement();
            stmt.executeUpdate(sql);

            System.out.println("Table created successfully!");

            con.close();

        } catch (Exception e) {
       //     e.printStackTrace();
        }
    }
}
