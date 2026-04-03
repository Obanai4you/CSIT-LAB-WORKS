
package Lab1;

import javax.swing.*;
public class Lab1_Qn23Dialogs {
    public static void main(String[] args) {

        JFrame f = new JFrame("Q23 Dialogs");
        f.setSize(400,200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(new java.awt.BorderLayout());

        /* -------- Toolbar -------- */
        JToolBar tb = new JToolBar();

        JButton modalBtn = new JButton("modal dialog");
        JButton modelessBtn = new JButton("modelless dialog");

        /* -------- Modal Dialog -------- */
        modalBtn.addActionListener(e ->
            JOptionPane.showMessageDialog(f, "This is a modal dialog")
        );

        /* -------- Modeless Dialog -------- */
        modelessBtn.addActionListener(e -> {
            JDialog d = new JDialog(f, "Modeless Dialog", false); // false = modeless
            d.setSize(200,100);
            d.setLocationRelativeTo(f);
            d.setVisible(true);
        });

        tb.add(modalBtn);
        tb.add(modelessBtn);

        /* -------- Footer -------- */
        JLabel footer = new JLabel("Lab1, Priyanshu Shrestha, 23081040");
        footer.setHorizontalAlignment(SwingConstants.CENTER);

        f.add(tb, java.awt.BorderLayout.NORTH);
        f.add(footer, java.awt.BorderLayout.SOUTH);

        f.setVisible(true);
    }
}
