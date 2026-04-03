package Lab1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Lab1_Qn26OptionPane {
    public static void main(String[] args) {

        JFrame f = new JFrame("Q26 JOptionPane");
        f.setSize(400,300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(new FlowLayout());

        // Buttons
        JButton infoBtn = new JButton("Information Dialog");
        JButton errorBtn = new JButton("Error Dialog");
        JButton warningBtn = new JButton("Warning Dialog");
        JButton confirmBtn = new JButton("Confirm Dialog");
        JButton inputBtn = new JButton("Input Dialog");
        JButton optionBtn = new JButton("Option Dialog");

        // -------- Action Listeners --------
        infoBtn.addActionListener(e -> 
            JOptionPane.showMessageDialog(f, "This is an information message", 
                                          "Information", JOptionPane.INFORMATION_MESSAGE)
        );

        errorBtn.addActionListener(e -> 
            JOptionPane.showMessageDialog(f, "This is an error message", 
                                          "Error", JOptionPane.ERROR_MESSAGE)
        );

        warningBtn.addActionListener(e -> 
            JOptionPane.showMessageDialog(f, "This is a warning message", 
                                          "Warning", JOptionPane.WARNING_MESSAGE)
        );

        confirmBtn.addActionListener(e -> {
            int result = JOptionPane.showConfirmDialog(f, "Do you want to continue?", 
                                                       "Confirm", JOptionPane.YES_NO_OPTION);
            JOptionPane.showMessageDialog(f, "You chose: " + (result == JOptionPane.YES_OPTION ? "Yes" : "No"));
        });

        inputBtn.addActionListener(e -> {
            String input = JOptionPane.showInputDialog(f, "Enter your name:");
            JOptionPane.showMessageDialog(f, "You entered: " + input);
        });

        optionBtn.addActionListener(e -> {
            String[] options = {"Red", "Green", "Blue"};
            int choice = JOptionPane.showOptionDialog(f, "Choose a color", "Option Dialog",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                    null, options, options[0]);
            if(choice >= 0) {
                JOptionPane.showMessageDialog(f, "You chose: " + options[choice]);
            }
        });

        // Add buttons to frame
        f.add(infoBtn);
        f.add(errorBtn);
        f.add(warningBtn);
        f.add(confirmBtn);
        f.add(inputBtn);
        f.add(optionBtn);

        // Footer
        JLabel footer = new JLabel("Lab1, Priyanshu Shrestha, 23081040");
        footer.setHorizontalAlignment(SwingConstants.CENTER);
        f.add(footer);

        f.setVisible(true);
    }
}
    

