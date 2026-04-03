
package Lab1;
import javax.swing.*;

public class Lab1_Qn25InternalFrame {

    public static void main(String[] args) {

        JFrame f = new JFrame("Q25 Internal Frame");
        f.setSize(400,300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(new java.awt.BorderLayout());

        // Desktop pane
        JDesktopPane dp = new JDesktopPane();

        // Internal frame
        JInternalFrame i = new JInternalFrame(
                "Internal Frame", // title
                true,  // resizable
                true,  // closable
                true,  // maximizable
                true   // iconifiable
        );
        i.setSize(200,150);
        i.setVisible(true);

        dp.add(i);

        // Footer
        JLabel footer = new JLabel("Lab1, Priyanshu Shrestha, 23081040");
        footer.setHorizontalAlignment(SwingConstants.CENTER);

        // Add components
        f.add(dp, java.awt.BorderLayout.CENTER);
        f.add(footer, java.awt.BorderLayout.SOUTH);

        f.setVisible(true);
    }
}

