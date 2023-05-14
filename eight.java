import java.awt.TextField;
import java.awt.*;

public class eight {
    public static void main(String[] args) {
        Frame f = new Frame();
        f.setSize(1500, 1500);
        TextField tf1 = new TextField();
        tf1.setBounds(30, 40, 150, 30);
        TextField tf2 = new TextField();
        tf2.setBounds(30, 60, 150, 30);
        Button b = new Button("hey");
        b.setBounds(20, 30, 80, 100);
        f.add(tf1);
        f.add(tf2);
        f.add(b);
        f.setVisible(true);

    }

}
