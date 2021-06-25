package org.example;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class  App {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });


    }

    private static void createAndShowGUI() {

        JFrame f = new CustomFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(750,750);

        // eventually:
        addCombozzTo(f);

        f.setVisible(true);
    }

    static void addCombozzTo(JFrame f) {
        String country[] = {"iOS", "MacOs", "Unix"};
        JComboBox cb = new JComboBox(country);
        cb.setBounds(50, 50, 120, 20);
        f.add(cb);
        f.setLayout(null);

        cb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String s = (String) cb.getItemAt(cb.getSelectedIndex());
                System.out.println(s);
            }
        });
    }
}
