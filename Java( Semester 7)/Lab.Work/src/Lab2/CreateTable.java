package Lab2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/java";
        String user = "root";
        String password = ""; // change this

        String sql = "CREATE TABLE IF NOT EXISTS student ("
                   + "id INT AUTO_INCREMENT PRIMARY KEY, "
                   + "name VARCHAR(100) NOT NULL, "
                   + "faculty VARCHAR(100) NOT NULL"
                   + ")";

        try (Connection con = DriverManager.getConnection(url, user, password);
             Statement stmt = con.createStatement()) {

            stmt.executeUpdate(sql);
            System.out.println("Student table created successfully!");

        } catch (SQLException e) {
//            e.printStackTrace();
        }
    }
}
