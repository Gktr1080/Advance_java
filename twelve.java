import java.awt.*;

import javax.swing.JRadioButton;

public class twelve {
    public static void main(String[] args) {
        Frame f1 = new Frame();
        f1.setSize(500, 500);
        Label l1 = new Label("Select a Color:");
        l1.setBounds(100, 50, 150, 30);

        JRadioButton r1 = new JRadioButton("Red");
        JRadioButton r2 = new JRadioButton("Green");
        JRadioButton r3 = new JRadioButton("Blue");
        r1.setBounds(75, 100, 100, 30);
        r2.setBounds(75, 140, 100, 30);
        r3.setBounds(75, 180, 100, 30);

        f1.add(l1);
        f1.add(r1);
        f1.add(r2);
        f1.add(r3);

        f1.setLayout(null);
        f1.setVisible(true);

    }

}
