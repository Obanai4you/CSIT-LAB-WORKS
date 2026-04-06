package Lab2;

import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class Lab2Qn37SwingCRUD {

    public static void main(String[] args) {

        JFrame f = new JFrame("CRUD Application - student_info");

        // ---------------------- Form Fields ----------------------
        JTextField t1 = new JTextField(); // ID (numeric)
        JTextField t2 = new JTextField(); // Name

        JRadioButton male = new JRadioButton("Male");
        JRadioButton female = new JRadioButton("Female");
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);

        String[] courses = {"Computer Science", "Math", "Physics"};
        JComboBox<String> combo = new JComboBox<>(courses);

        t1.setBounds(50,50,150,30);
        t2.setBounds(50,100,150,30);
        male.setBounds(50,150,70,30);
        female.setBounds(130,150,80,30);
        combo.setBounds(50,200,150,30);

        // ---------------------- Buttons ----------------------
        JButton add = new JButton("Insert");
        JButton update = new JButton("Update");
        JButton delete = new JButton("Delete");
        JButton show = new JButton("Show");

        add.setBounds(50,250,80,30);
        update.setBounds(140,250,80,30);
        delete.setBounds(230,250,80,30);
        show.setBounds(50,300,80,30);

        // ---------------------- DATABASE SETUP ----------------------
        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/lab2db","root","");

            Statement st = con.createStatement();

            // Create table if not exists
            st.executeUpdate(
                "CREATE TABLE IF NOT EXISTS student_info (" +
                "id INT PRIMARY KEY," +
                "name VARCHAR(50)," +
                "gender VARCHAR(10)," +
                "course VARCHAR(50)," +
                "marks INT)"
            );

            con.close();
        } catch(Exception ex) {
            ex.printStackTrace();
        }

        // ---------------------- INSERT ----------------------
        add.addActionListener(e -> {
            try {
                int id = Integer.parseInt(t1.getText());
                String name = t2.getText();
                String gender = male.isSelected() ? "Male" : "Female";
                String course = combo.getSelectedItem().toString();
                int marks = 0; // default marks

                Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/lab2db","root","");

                PreparedStatement ps = con.prepareStatement(
                    "INSERT INTO student_info VALUES(?,?,?,?,?)"
                );
                ps.setInt(1,id);
                ps.setString(2,name);
                ps.setString(3,gender);
                ps.setString(4,course);
                ps.setInt(5,marks);

                ps.executeUpdate();
                JOptionPane.showMessageDialog(f,"Inserted Successfully");
                con.close();

            } catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(f,"ID must be a number!");
            } catch(Exception ex){
                ex.printStackTrace();
            }
        });

        // ---------------------- UPDATE ----------------------
        update.addActionListener(e -> {
            try {
                int id = Integer.parseInt(t1.getText());
                String name = t2.getText();
                String gender = male.isSelected() ? "Male" : "Female";
                String course = combo.getSelectedItem().toString();

                Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/lab2db","root","");

                PreparedStatement ps = con.prepareStatement(
                    "UPDATE student_info SET name=?, gender=?, course=? WHERE id=?"
                );
                ps.setString(1,name);
                ps.setString(2,gender);
                ps.setString(3,course);
                ps.setInt(4,id);

                ps.executeUpdate();
                JOptionPane.showMessageDialog(f,"Updated Successfully");
                con.close();

            } catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(f,"ID must be a number!");
            } catch(Exception ex){
                ex.printStackTrace();
            }
        });

        // ---------------------- DELETE ----------------------
        delete.addActionListener(e -> {
            try {
                int id = Integer.parseInt(t1.getText());

                Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/lab2db","root","");

                PreparedStatement ps = con.prepareStatement(
                    "DELETE FROM student_info WHERE id=?"
                );
                ps.setInt(1,id);
                ps.executeUpdate();

                JOptionPane.showMessageDialog(f,"Deleted Successfully");
                con.close();

            } catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(f,"ID must be a number!");
            } catch(Exception ex){
                ex.printStackTrace();
            }
        });

        // ---------------------- SHOW ----------------------
        show.addActionListener(e -> {
            try {
                Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/lab2db","root","");

                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("SELECT * FROM student_info");

                System.out.println("ID\tName\tGender\tCourse\tMarks");
                System.out.println("----------------------------------------");
                while(rs.next()){
                    System.out.println(
                        rs.getInt("id")+" "+rs.getString("name")+" "+
                        rs.getString("gender")+" "+rs.getString("course")+" "+
                        rs.getInt("marks")
                    );
                }

                con.close();
            } catch(Exception ex){ ex.printStackTrace(); }
        });

        // ---------------------- Add components ----------------------
        f.add(t1); f.add(t2); f.add(male); f.add(female);
        f.add(combo); f.add(add); f.add(update); f.add(delete); f.add(show);

        f.setSize(500,400);
        f.setLayout(null);
        f.setVisible(true);

        System.out.println("Lab2,Priyanshu Shrestha, 23081040");
    }
}