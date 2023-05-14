import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class lab7_2 extends JFrame {
    private JLabel numberLabel;

    public lab7_2() {
        setTitle("Random Number Generator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        numberLabel = new JLabel();
        panel.add(numberLabel);

        JButton generateButton = new JButton("Generate");
        generateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int randomNumber = generateRandomNumber();
                numberLabel.setText("Random Number: " + randomNumber);
            }
        });
        panel.add(generateButton);

        add(panel);
    }

    private int generateRandomNumber() {
        Random random = new Random();
        return random.nextInt(10) + 1;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                lab7_2 l2 = new lab7_2();
                l2.setVisible(true);
            }
        });
    }

}
