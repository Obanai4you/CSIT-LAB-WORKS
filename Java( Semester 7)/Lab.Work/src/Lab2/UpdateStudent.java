package Lab2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateStudent {

    public static void updateStudentName(int id, String newName) {

        String url = "jdbc:mysql://localhost:3306/java";
        String user = "root";
        String password = "";

        String sql = "UPDATE student SET name = ? WHERE id = ?";

        try {
            Connection con = DriverManager.getConnection(url, user, password);
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, newName);
            ps.setInt(2, id);

            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Student name updated successfully");
            } else {
                System.out.println("Student not found");
            }

            ps.close();
            con.close();

        } catch (Exception e) {
//            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        updateStudentName(7, "Rammm Gajurel");
    }
}
