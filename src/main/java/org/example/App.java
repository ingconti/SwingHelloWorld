package org.example;


import javax.swing.*;

public class App {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    private static void createAndShowGUI() {
        System.out.println("Created GUI on EDT? "+
                SwingUtilities.isEventDispatchThread());

        JFrame f = new CustomFrame();


        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(750,750);
        f.setVisible(true);
    }
}
