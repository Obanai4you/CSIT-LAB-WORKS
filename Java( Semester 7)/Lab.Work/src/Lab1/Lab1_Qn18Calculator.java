package Lab1;
import javax.swing.*;

public class Lab1_Qn18Calculator {
    
    public static void main(String[] args) {

        JFrame f = new JFrame("Q18 Calculator");
        f.setSize(400,300);
        f.setLayout(null);

        JTextField t1 = new JTextField();
        JTextField t2 = new JTextField();
        JLabel result = new JLabel("Result:");

        JButton add = new JButton("+");
        JButton sub = new JButton("-");
        JButton mul = new JButton("*");

        t1.setBounds(20,20,100,25);
        t2.setBounds(140,20,100,25);
        add.setBounds(20,60,50,30);
        sub.setBounds(80,60,50,30);
        mul.setBounds(140,60,50,30);
        result.setBounds(20,110,200,25);

        add.addActionListener(e ->
            result.setText("Result: "+(Integer.parseInt(t1.getText()) + Integer.parseInt(t2.getText())))
        );
        sub.addActionListener(e ->
            result.setText("Result: "+(Integer.parseInt(t1.getText()) - Integer.parseInt(t2.getText())))
        );
        mul.addActionListener(e ->
            result.setText("Result: "+(Integer.parseInt(t1.getText()) * Integer.parseInt(t2.getText())))
        );

        f.add(t1); f.add(t2);
        f.add(add); f.add(sub); f.add(mul);
        f.add(result);

        JLabel footer = new JLabel("Lab1, Priyanshu Shrestha ,23081040");
        footer.setBounds(10,240,300,20);
        f.add(footer);

        f.setVisible(true);
    }
}
    

