
package Lab1;
import javax.swing.*;
import java.awt.event.*;

public class Lab1_Qn17EventHandling extends JFrame implements ActionListener {
    
    JButton b1, b2, b3, b4;
    JLabel output;

    public Lab1_Qn17EventHandling() {
        setTitle("Q17 Event Handling");
        setSize(400,300);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        /* -------- Output Label -------- */
        output = new JLabel("Output will appear here");
        output.setBounds(20,20,350,25);
        add(output);

        /* -------- Same Class -------- */
        b1 = new JButton("Same Class");
        b1.setBounds(20,60,150,30);
        b1.addActionListener(this);
        add(b1);

        /* -------- Inner Class -------- */
        b2 = new JButton("Inner Class");
        b2.setBounds(20,100,150,30);
        b2.addActionListener(new InnerHandler());
        add(b2);

        /* -------- Anonymous Inner Class -------- */
        b3 = new JButton("Anonymous");
        b3.setBounds(20,140,150,30);
        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                output.setText("Event handled using anonymous inner class");
            }
        });
        add(b3);

        /* -------- Another Class -------- */
        b4 = new JButton("Other Class");
        b4.setBounds(20,180,150,30);
        b4.addActionListener(new ExternalHandler(output));
        add(b4);

        JLabel footer = new JLabel("Lab1, Priyanshu Shrestha, 23081040");
        footer.setBounds(20,220,300,20);
        add(footer);

        setVisible(true);
    }

    /* -------- Same Class Handler -------- */
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            output.setText("Event handled in same class");
        }
    }

    /* -------- Inner Class Handler -------- */
    class InnerHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            output.setText("Event handled in inner class");
        }
    }

    public static void main(String[] args) {
        new Lab1_Qn17EventHandling();
    }
}

/* -------- External Class Handler -------- */
class ExternalHandler implements ActionListener {

    JLabel output;

    ExternalHandler(JLabel output) {
        this.output = output;
    }

    public void actionPerformed(ActionEvent e) {
        output.setText("Event handled in another class");
    }
}

