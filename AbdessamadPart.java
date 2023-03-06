//part one of the code 

import javax.swing.*;

public class AbdessamadPart {
    public static void main(String[] args) {
        JFrame frame = new JFrame("SquareGUI");

        JLabel label1 = new JLabel("Type a number:");
        JTextField textField = new JTextField(10);

        frame.getContentPane().add(label1);
        frame.getContentPane().add(textField);

        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}