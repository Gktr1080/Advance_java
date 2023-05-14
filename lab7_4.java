import javax.swing.*;
// import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

public class lab7_4 extends JFrame {
    private JButton button;
    private Random random;

    public lab7_4() {
        random = new Random();

        setTitle("Random Button Window");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        setLayout(null);
        setLocationRelativeTo(null);

        button = new JButton("Click me");
        button.setBounds(100, 50, 200, 40);
        button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                moveButtonToRandomLocation();
            }
        });
        add(button);
        setVisible(true);
    }

    private void moveButtonToRandomLocation() {
        int width = getContentPane().getWidth() - button.getWidth();
        int height = getContentPane().getHeight() - button.getHeight();
        int x = random.nextInt(width);
        int y = random.nextInt(height);
        button.setLocation(x, y);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(lab7_4::new);
    }
}
