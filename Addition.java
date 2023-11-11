package Sample;

import javax.swing.*;

public class Addition {
    public static void addition() {
        JFrame frame = new JFrame("Addition");

        JButton button = new JButton("1");
        button.setBounds(20, 170, 50, 40);
		
        JButton button1 = new JButton("2");
        button1.setBounds(40, 170, 50, 40);
		
        JButton button2 = new JButton("3");
        button2.setBounds(60, 170, 50, 40);
		
        JButton button3 = new JButton("4");
        button3.setBounds(80, 170, 50, 40);
		
        JButton button4 = new JButton("5");
        button4.setBounds(100, 170, 50, 40);

        frame.add(button);
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        addition(); // Call the addition method to create and display the GUI.
    }
}
