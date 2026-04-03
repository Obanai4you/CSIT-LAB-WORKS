package Lab1;

import javax.swing.*;
import java.awt.event.*;

public class Lab1_Qn21Menu {
     public static void main(String[] args) {

        JFrame f = new JFrame("Menu Demo");
        f.setSize(400,300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        /* -------- Menu Bar -------- */
        JMenuBar mb = new JMenuBar();

        /* -------- File Menu -------- */
        JMenu file = new JMenu("File");
        file.setMnemonic(KeyEvent.VK_F);

        JMenuItem open = new JMenuItem("Open");
        open.setMnemonic(KeyEvent.VK_O);
        open.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, ActionEvent.CTRL_MASK));

        JMenuItem exit = new JMenuItem("Exit");
        exit.setMnemonic(KeyEvent.VK_X);

        exit.addActionListener(e -> System.exit(0));
        

        file.add(open);
        file.add(exit);

        /* -------- Options Menu -------- */
        JMenu options = new JMenu("Options");

        JCheckBoxMenuItem check = new JCheckBoxMenuItem("Enable Option");

        JRadioButtonMenuItem r1 = new JRadioButtonMenuItem("Mode 1");
        JRadioButtonMenuItem r2 = new JRadioButtonMenuItem("Mode 2");

        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);

        options.add(check);
        options.add(r1);
        options.add(r2);

        /* -------- Disable Menu Item -------- */
        open.addActionListener(e -> open.setEnabled(false));

        mb.add(file);
        mb.add(options);

        f.setJMenuBar(mb);

        /* -------- Footer -------- */
        JLabel footer = new JLabel("Lab1, Priyanshu Shrestha, 23081040");
        footer.setHorizontalAlignment(SwingConstants.CENTER);
        f.add(footer);

        f.setVisible(true);
    }
}
