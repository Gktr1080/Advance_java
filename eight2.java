
import java.awt.*;

public class eight2 extends Frame {
    public eight2() {
        // Frame f = new Frame();
        setSize(1100, 1300);
        TextField tf1 = new TextField();
        tf1.setBounds(30, 40, 150, 30);
        TextField tf2 = new TextField();
        tf2.setBounds(30, 60, 150, 30);
        Button b = new Button("hey");
        b.setBounds(20, 30, 180, 30);
        add(tf1);
        add(tf2);
        add(b);
        setVisible(true);

    }

    public static void main(String[] args) {
        new eight2();

    }

}
