import javax.swing.*;
import java.awt.event.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class lab7_1 {
    private JFrame frame;
    private JLabel timeLabel;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            lab7_1 l = new lab7_1();
            l.createAndShowGUI();
        });
    }

    private void createAndShowGUI() {
        frame = new JFrame("Time Label Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        timeLabel = new JLabel();

        updateTimeLabel();

        JButton button = new JButton("Update Time");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                updateTimeLabel();
            }
        });

        panel.add(timeLabel);
        panel.add(button);
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
        frame.setBounds(30, 160, 500, 303);

    }

    private void updateTimeLabel() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        String currentTime = dateFormat.format(new Date());
        timeLabel.setText("Current Time: " + currentTime);
    }

}
