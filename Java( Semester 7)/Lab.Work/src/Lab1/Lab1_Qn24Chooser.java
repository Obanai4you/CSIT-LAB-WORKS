
package Lab1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Lab1_Qn24Chooser {
     public static void main(String[] args) {

        JFrame f = new JFrame("Q24 Chooser");
        f.setSize(400,200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(new BorderLayout());

        // Panel for buttons
        JPanel panel = new JPanel();
        JButton fileBtn = new JButton("file chooser");
        JButton colorBtn = new JButton("color chooser");

        panel.add(fileBtn);
        panel.add(colorBtn);

        // File chooser button action
        fileBtn.addActionListener(e -> {
            JFileChooser fc = new JFileChooser();
            int result = fc.showOpenDialog(f);
            if (result == JFileChooser.APPROVE_OPTION) {
                JOptionPane.showMessageDialog(f, "Selected file: " + fc.getSelectedFile());
            }
        });

        // Color chooser button action
        colorBtn.addActionListener(e -> {
            Color c = JColorChooser.showDialog(f, "Pick a color", Color.WHITE);
            if (c != null) {
                f.getContentPane().setBackground(c); // Optional: change frame color
            }
        });

        // Footer
        JLabel footer = new JLabel("Lab1, Priyanshu Shrestha, 23081040");
        footer.setHorizontalAlignment(SwingConstants.CENTER);

        // Add components to frame
        f.add(panel, BorderLayout.CENTER);
        f.add(footer, BorderLayout.SOUTH);

        f.setVisible(true);
    }
}

