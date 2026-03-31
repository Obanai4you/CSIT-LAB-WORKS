package Lab2;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class AuthenticationForm extends Frame implements ActionListener {

    TextField tfEmail, tfPassword;
    Button btnLogin;

    public AuthenticationForm() {

        setTitle("Login Form");

        Label l1 = new Label("Email:");
        Label l2 = new Label("Password:");

        tfEmail = new TextField();
        tfPassword = new TextField();
        tfPassword.setEchoChar('*');

        btnLogin = new Button("Login");
        btnLogin.addActionListener(this);

        setLayout(null);

        l1.setBounds(50, 80, 80, 20);
        tfEmail.setBounds(150, 80, 150, 20);

        l2.setBounds(50, 120, 80, 20);
        tfPassword.setBounds(150, 120, 150, 20);

        btnLogin.setBounds(150, 170, 80, 30);

        add(l1); add(tfEmail);
        add(l2); add(tfPassword);
        add(btnLogin);

        setSize(400, 300);
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String email = tfEmail.getText();
        String password = tfPassword.getText();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/java",
                    "root",
                    ""
            );

            String sql = "SELECT * FROM users WHERE email=? AND password=?";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, email);
            ps.setString(2, password);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                Dialog d = new Dialog(this, "Success", true);
                d.setLayout(new FlowLayout());
                d.add(new Label("Login Successful!"));

                Button ok = new Button("OK");
                ok.addActionListener(ev -> d.setVisible(false));

                d.add(ok);
                d.setSize(200, 120);
                d.setVisible(true);

            } else {

                Dialog d = new Dialog(this, "Error", true);
                d.setLayout(new FlowLayout());
                d.add(new Label("Invalid Email or Password!"));

                Button ok = new Button("OK");
                ok.addActionListener(ev -> d.setVisible(false));

                d.add(ok);
                d.setSize(220, 120);
                d.setVisible(true);
            }

            rs.close();
            ps.close();
            con.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new AuthenticationForm();
    }
} 
