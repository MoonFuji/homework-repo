import javax.swing.*;
import java.awt.event.*;
public class SquareGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("SquareGUI");
        JLabel label1 = new JLabel("Type a number:");
        JTextField textField = new JTextField(10);
        JLabel label2 = new JLabel();
        JButton button = new JButton("Square");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int num = Integer.parseInt(textField.getText());
                int square = num * num;
                label2.setText(String.valueOf(square));
            }
        });
        frame.getContentPane().add(label1);
        frame.getContentPane().add(textField);
        frame.getContentPane().add(label2);
        frame.getContentPane().add(button);
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}