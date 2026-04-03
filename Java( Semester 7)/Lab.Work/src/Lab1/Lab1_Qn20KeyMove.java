
package Lab1;
import javax.swing.*;
import java.awt.event.*;

public class Lab1_Qn20KeyMove {
    public static void main(String[] args) {

        JFrame f = new JFrame("Key Event Demo");
        f.setSize(300,300);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Label acts as image
        JLabel img = new JLabel("★");
        img.setBounds(130,120,20,20);
        f.add(img);

        // Key event handling
        f.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {

                int x = img.getX();
                int y = img.getY();

                if (e.getKeyCode() == KeyEvent.VK_LEFT)
                    img.setLocation(x - 10, y);

                if (e.getKeyCode() == KeyEvent.VK_RIGHT)
                    img.setLocation(x + 10, y);

                if (e.getKeyCode() == KeyEvent.VK_UP)
                    img.setLocation(x, y - 10);

                if (e.getKeyCode() == KeyEvent.VK_DOWN)
                    img.setLocation(x, y + 10);
            }
        });

        // Footer
        JLabel footer = new JLabel("Lab1, Priyanshu Shrestha, 23081040");
        footer.setBounds(10,250,300,20);
        f.add(footer);

        f.setFocusable(true);
        f.setVisible(true);
    }
}

