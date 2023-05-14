import java.awt.*;
public class tenth {
    public static void main(String[] args) {
                Frame f = new Frame();
                f.setSize(100, 200);
                Label l = new Label("Enter your Name");
                l.setBounds(30, 60, 200, 100);
                l.setFont(new Font("TimesRoman", Font.BOLD, 20));
                TextField tf = new TextField();
                tf.setBounds(30, 160, 200, 30);
                f.add(l);
                f.add(tf);
                f.setSize(300,300);
                f.setLayout(null);
                f.setVisible(true);
    }
    
}
