
/**
 * Brennan Andruss
 * GUI Playground
 * 
 * Description: Learn how to create a GUI
*/

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String args[]) {

        TicTacToe frame = new TicTacToe();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 320);
        frame.setVisible(true);

        // new Calculator();

        // // Creating the frame
        // JFrame frame = new JFrame("Project 2");
        // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // frame.setSize(400, 400);

        // // Creating menu bar
        // JMenuBar menuBar = new JMenuBar();
        // JMenu m1 = new JMenu("File");
        // JMenu m2 = new JMenu("Edit");
        // menuBar.add(m1);
        // menuBar.add(m2);
        // frame.getContentPane().add(BorderLayout.NORTH, menuBar);
        // frame.setVisible(true);

        // // Creating menu dropdowns
        // JMenuItem m11 = new JMenuItem("New");
        // JMenuItem m12 = new JMenuItem("Open");
        // JMenuItem m13 = new JMenuItem("Save");
        // m1.add(m11);
        // m1.add(m12);
        // m1.add(m13);

        // JMenuItem m21 = new JMenuItem("Undo");
        // JMenuItem m22 = new JMenuItem("Redo");
        // JMenuItem m23 = new JMenuItem("Copy");
        // JMenuItem m24 = new JMenuItem("Paste");
        // m2.add(m21);
        // m2.add(m22);
        // m2.add(m23);
        // m2.add(m24);

        // // // Creating buttons
        // // JButton b1 = new JButton("Press 1");
        // // JButton b2 = new JButton("Press 2");
        // // frame.getContentPane().add(b1);
        // // frame.getContentPane().add(b2);
        // // frame.setVisible(true);

    }
}