package Lab2;

import java.sql.*;

public class Lab2Qn36TransactionDemo {
    public static void main(String[] args) {

        try {
            // Step 1: Connect to database
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/lab2db","root",""
            );

            // Step 2: Start transaction
            con.setAutoCommit(false);

            Statement st = con.createStatement();

            // ---------------------- Transaction Operations ----------------------
            st.executeUpdate("INSERT INTO student VALUES(201,'TransactionTest1',85)");
            st.executeUpdate("INSERT INTO student VALUES(202,'TransactionTest2',90)");

            // Commit transaction
            con.commit();
            System.out.println("Transaction Success");

            // Close connection
            con.close();
            System.out.println("Lab2, Priyanshu Shrestha, 23081040");

        } catch(Exception e){
            e.printStackTrace();
        }
    }
}