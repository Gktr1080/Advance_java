import javax.swing.*;
import java.awt.*;

public class lab7_3 extends JFrame {

    public lab7_3() {
        super("Text Controls Demo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 300);
        JPanel panel = new JPanel(new GridLayout(4, 1, 10, 10));
        JTextField textField = new JTextField(20);
        panel.add(new JLabel("Text Field: "));
        panel.add(textField);
        JPasswordField passwordField = new JPasswordField(20);
        panel.add(new JLabel("Password Field: "));
        panel.add(passwordField);
        JTextArea textArea = new JTextArea(5, 20);
        JScrollPane scrollPane = new JScrollPane(textArea);
        panel.add(new JLabel("Text Area: "));
        panel.add(scrollPane);
        getContentPane().add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        new lab7_3();
    }

}
