/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Nim;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NimGraphic {

    public static void main(String args[]) {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel(new GridLayout(2, 2));
        JLabel label = new JLabel("alksjfd");
        label.setPreferredSize(new Dimension(500, 700));
        frame.getContentPane().add(label);
        frame.pack();
        frame.setVisible(true);

    }
}
