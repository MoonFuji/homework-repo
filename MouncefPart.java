import javax.swing.*;

public class MouncefPart {
    public static void main(String[] args) {
        JFrame frame = new JFrame("SquareGUI");
        JLabel label1 = new JLabel("Type a number:");
        JTextField textField = new JTextField(10);
        JLabel label2 = new JLabel();
        frame.getContentPane().add(label1);
        frame.getContentPane().add(textField);
        frame.getContentPane().add(label2);
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}