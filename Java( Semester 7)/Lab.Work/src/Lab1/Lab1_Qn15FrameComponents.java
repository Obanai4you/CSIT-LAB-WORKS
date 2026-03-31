package lab1;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.*;

public class Lab1_Qn15FrameComponents {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Lab1 - Swing Components");
        frame.setSize(600, 500);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null); // center window

        // Frame icon (logo)
        ImageIcon logo = new ImageIcon("logo.png"); // keep image in project folder
        frame.setIconImage(logo.getImage());

        // Label with icon
        JLabel iconLabel = new JLabel("Java", logo, JLabel.LEFT);
        iconLabel.setBounds(20, 10, 180, 40);
        frame.add(iconLabel);

        // Label with name
        JLabel nameLabel = new JLabel("Priyanshu Shrestha");
        nameLabel.setBounds(20, 55, 200, 20);
        frame.add(nameLabel);

        // Text field with colorful border & tooltip
        JTextField tf = new JTextField();
        tf.setBounds(20, 85, 200, 30);
        tf.setToolTipText("Enter your name here");
        tf.setBorder(new LineBorder(Color.BLUE, 2));
        frame.add(tf);

        // Password field
        JPasswordField pf = new JPasswordField();
        pf.setBounds(20, 130, 200, 30);
        pf.setToolTipText("Enter password");
        frame.add(pf);

        // Text area with scroll bars
        JTextArea ta = new JTextArea();
        JScrollPane sp = new JScrollPane(ta,
                JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        sp.setBounds(20, 180, 250, 100);
        frame.add(sp);

        // Check box
        JCheckBox cb = new JCheckBox("Accept Terms");
        cb.setBounds(20, 290, 150, 25);
        frame.add(cb);

        // Radio buttons
        JRadioButton rb1 = new JRadioButton("Male");
        JRadioButton rb2 = new JRadioButton("Female");
        rb1.setBounds(20, 320, 80, 25);
        rb2.setBounds(110, 320, 100, 25);

        ButtonGroup bg = new ButtonGroup();
        bg.add(rb1);
        bg.add(rb2);

        frame.add(rb1);
        frame.add(rb2);

        // Combo box (extra but okay)
        String[] course = {"CSIT", "BCA", "BIM"};
        JComboBox<String> combo = new JComboBox<>(course);
        combo.setBounds(20, 350, 120, 30);
        frame.add(combo);

        // Push button
        JButton btn = new JButton("Submit");
        btn.setBounds(160, 350, 100, 30);
        frame.add(btn);

        // Button action
        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = tf.getText();
                String course = combo.getSelectedItem().toString();
                JOptionPane.showMessageDialog(frame,
                        "Name: " + name + "\nCourse: " + course);
            }
        });

        // Footer (MANDATORY)
        JLabel footer = new JLabel("Lab1, Priyanshu Shrestha, 23081040");
        footer.setBounds(10, 420, 300, 20);
        frame.add(footer);

        frame.setVisible(true);
    }
}