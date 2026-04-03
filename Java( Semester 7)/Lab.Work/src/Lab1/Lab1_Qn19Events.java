
package Lab1;
import javax.swing.*;
import java.awt.event.*;

public class Lab1_Qn19Events extends JFrame {
    JLabel output;
    JTextField textField;
    JCheckBox checkBox;
    
    public Lab1_Qn19Events() {

        setTitle("Q19 Event Handling Demo");
        setSize(450,350);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        /* -------- Output Label -------- */
        output = new JLabel("Event output will appear here");
        output.setBounds(20,20,400,25);
        add(output);

        /* -------- Focus Event -------- */
        textField = new JTextField();
        textField.setBounds(20,60,200,25);
        add(textField);

        textField.addFocusListener(new FocusListener() {
            public void focusGained(FocusEvent e) {
                output.setText("Focus event: TextField gained focus");
            }
            public void focusLost(FocusEvent e) {
                output.setText("Focus event: TextField lost focus");
            }
        });

        /* -------- Item Event -------- */
        checkBox = new JCheckBox("Accept Terms");
        checkBox.setBounds(20,100,150,25);
        add(checkBox);

        checkBox.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED)
                    output.setText("Item event: Checkbox selected");
                else
                    output.setText("Item event: Checkbox deselected");
            }
        });

        /* -------- Mouse Event (Adapter Class) -------- */
        addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                output.setText("Mouse event: Mouse clicked at (" 
                        + e.getX() + ", " + e.getY() + ")");
            }
        });

        /* -------- Key Event -------- */
        addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                output.setText("Key event: Key pressed - " + e.getKeyChar());
            }
        });

        setFocusable(true);

        /* -------- Window Event -------- */
        addWindowListener(new WindowAdapter() {
            public void windowOpened(WindowEvent e) {
                output.setText("Window event: Window opened");
            }
            public void windowClosing(WindowEvent e) {
                System.out.println("Window closing");
            }
        });

        /* -------- Footer -------- */
        JLabel footer = new JLabel("Lab1, Priyanshu Shrestha, 23081040");
        footer.setBounds(20,280,300,20);
        add(footer);

        setVisible(true);
    }

    public static void main(String[] args) {
        new Lab1_Qn19Events();
    }
}
