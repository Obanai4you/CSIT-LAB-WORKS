package Lab2;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Insert extends Frame implements ActionListener {

    TextField tfName, tfEmail, tfPassword;
    CheckboxGroup genderGroup;
    Button btnRegister;

    public Insert() {

        setTitle("Registration Form");

        // Labels
        Label l1 = new Label("Name:");
        Label l2 = new Label("Email:");
        Label l3 = new Label("Password:");
        Label l4 = new Label("Gender:");

        // TextFields
        tfName = new TextField();
        tfEmail = new TextField();
        tfPassword = new TextField();
        tfPassword.setEchoChar('*');

        // Gender
        genderGroup = new CheckboxGroup();
        Checkbox male = new Checkbox("Male", genderGroup, false);
        Checkbox female = new Checkbox("Female", genderGroup, false);

        // Button
        btnRegister = new Button("Register");
        btnRegister.addActionListener(this);

        // Layout
        setLayout(null);

        l1.setBounds(50, 50, 80, 20);
        tfName.setBounds(150, 50, 150, 20);

        l2.setBounds(50, 90, 80, 20);
        tfEmail.setBounds(150, 90, 150, 20);

        l3.setBounds(50, 130, 80, 20);
        tfPassword.setBounds(150, 130, 150, 20);

        l4.setBounds(50, 170, 80, 20);
        male.setBounds(150, 170, 60, 20);
        female.setBounds(220, 170, 70, 20);

        btnRegister.setBounds(150, 210, 80, 30);

        add(l1); add(tfName);
        add(l2); add(tfEmail);
        add(l3); add(tfPassword);
        add(l4); add(male); add(female);
        add(btnRegister);

        setSize(400, 300);
        setVisible(true);

        // Close window properly
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String name = tfName.getText();
        String email = tfEmail.getText();
        String password = tfPassword.getText();

        Checkbox selected = genderGroup.getSelectedCheckbox();

        if (selected == null) {
            System.out.println("Please select gender!");
            return;
        }

        String gender = selected.getLabel();

        try {
            // Load Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Connect to Database
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/java",
                    "root",
                    ""   // put your MySQL password if any
            );

            String sql = "INSERT INTO users(name, email, password, gender) VALUES (?, ?, ?, ?)";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, name);
            ps.setString(2, email);
            ps.setString(3, password);
            ps.setString(4, gender);

            int rowsInserted = ps.executeUpdate();

            if (rowsInserted > 0) {

                Dialog d = new Dialog(this, "Success", true);
                d.setLayout(new FlowLayout());
                d.add(new Label("Registered Successfully!"));

                Button ok = new Button("OK");
                ok.addActionListener(ev -> d.setVisible(false));

                d.add(ok);
                d.setSize(220, 120);
                d.setVisible(true);
            }

            ps.close();
            con.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Insert();
    }
}
