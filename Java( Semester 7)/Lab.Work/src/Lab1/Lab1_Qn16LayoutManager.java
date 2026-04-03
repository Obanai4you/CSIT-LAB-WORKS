
package Lab1;
import javax.swing.*;
import java.awt.*;

public class Lab1_Qn16LayoutManager {
     public static void main(String[] args) {

        JFrame frame = new JFrame("Q16 Layout Managers - Single Panel");
        frame.setSize(900, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Main panel holding all layouts
        JPanel mainPanel = new JPanel(new GridLayout(3, 2, 10, 10));

        /* ---------------- Flow Layout ---------------- */
        JPanel flowPanel = new JPanel(new FlowLayout());
        flowPanel.setBorder(BorderFactory.createTitledBorder("FlowLayout"));
        flowPanel.add(new JButton("One"));
        flowPanel.add(new JButton("Two"));
        flowPanel.add(new JButton("Three"));

        /* ---------------- Border Layout ---------------- */
        JPanel borderPanel = new JPanel(new BorderLayout());
        borderPanel.setBorder(BorderFactory.createTitledBorder("BorderLayout"));
        borderPanel.add(new JButton("North"), BorderLayout.NORTH);
        borderPanel.add(new JButton("South"), BorderLayout.SOUTH);
        borderPanel.add(new JButton("East"), BorderLayout.EAST);
        borderPanel.add(new JButton("West"), BorderLayout.WEST);
        borderPanel.add(new JButton("Center"), BorderLayout.CENTER);

        /* ---------------- Grid Layout ---------------- */
        JPanel gridPanel = new JPanel(new GridLayout(2, 2, 5, 5));
        gridPanel.setBorder(BorderFactory.createTitledBorder("GridLayout"));
        gridPanel.add(new JButton("1"));
        gridPanel.add(new JButton("2"));
        gridPanel.add(new JButton("3"));
        gridPanel.add(new JButton("4"));

        /* ---------------- GridBag Layout ---------------- */
        JPanel gridBagPanel = new JPanel(new GridBagLayout());
        gridBagPanel.setBorder(BorderFactory.createTitledBorder("GridBagLayout"));
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);

        gbc.gridx = 0; gbc.gridy = 0;
        gridBagPanel.add(new JButton("A"), gbc);

        gbc.gridx = 1; gbc.gridy = 0;
        gridBagPanel.add(new JButton("B"), gbc);

        gbc.gridx = 0; gbc.gridy = 1;
        gbc.gridwidth = 2;
        gridBagPanel.add(new JButton("Wide Button"), gbc);

        /* ---------------- Group Layout ---------------- */
        JPanel groupPanel = new JPanel();
        groupPanel.setBorder(BorderFactory.createTitledBorder("GroupLayout"));
        GroupLayout gl = new GroupLayout(groupPanel);
        groupPanel.setLayout(gl);

        JButton g1 = new JButton("Left");
        JButton g2 = new JButton("Right");

        gl.setAutoCreateGaps(true);
        gl.setAutoCreateContainerGaps(true);

        gl.setHorizontalGroup(
                gl.createSequentialGroup()
                        .addComponent(g1)
                        .addComponent(g2)
        );

        gl.setVerticalGroup(
                gl.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(g1)
                        .addComponent(g2)
        );

        // Add all panels to main panel
        mainPanel.add(flowPanel);
        mainPanel.add(borderPanel);
        mainPanel.add(gridPanel);
        mainPanel.add(gridBagPanel);
        mainPanel.add(groupPanel);

        // Footer
        JLabel footer = new JLabel("Lab1, Priyanshu Shrestha, 23081040", SwingConstants.CENTER);

        frame.add(mainPanel, BorderLayout.CENTER);
        frame.add(footer, BorderLayout.SOUTH);

        frame.setVisible(true);
     }
}
