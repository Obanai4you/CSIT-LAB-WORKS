package Lab1;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;

public class Lab1_Qn22Components {
    public static void main(String[] args) {

        JFrame f = new JFrame("Q22 Components");
        f.setSize(500,400);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        /* -------- Slider -------- */
        JSlider slider = new JSlider(0, 100, 50); // min=0, max=100, initial=50
        slider.setBounds(20,20,200,50);

        /* -------- Table -------- */
        JTable table = new JTable(
                new String[][]{{"1","A"},{"2","B"}},
                new String[]{"ID","Name"}
        );
        JScrollPane tsp = new JScrollPane(table);
        tsp.setBounds(250,20,200,80);

        /* -------- List -------- */
        JList<String> list = new JList<>(new String[]{"Java","C","Python"});
        list.setBounds(20,90,100,60);

        /* -------- Progress Bar -------- */
        JProgressBar pb = new JProgressBar(0,100);
        pb.setValue(50);
        pb.setBounds(20,160,200,20);

        /* -------- Tree -------- */
        JTree tree = new JTree();
        tree.setBounds(250,120,200,150);

        /* -------- Output Label -------- */
        JLabel output = new JLabel("Event output will appear here");
        output.setBounds(20,200,400,25);

        /* -------- Slider Change Event -------- */
        slider.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                pb.setValue(slider.getValue()); // Update progress bar
                output.setText("Slider value: " + slider.getValue());
            }
        });

        /* -------- List Selection Event -------- */
        list.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                String selected = list.getSelectedValue();
                output.setText("Selected item: " + selected);
            }
        });

        /* -------- Add Components -------- */
        f.add(slider);
        f.add(tsp);
        f.add(list);
        f.add(pb);
        f.add(tree);
        f.add(output);

        /* -------- Footer -------- */
        JLabel footer = new JLabel("Lab1,Priyanshu Shrestha, 23081040");
        footer.setBounds(10,330,300,20);
        f.add(footer);

        f.setVisible(true);
    }
}
    

