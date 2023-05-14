import java.awt.*;
public class nine  extends Frame{
    public nine(){
        // Frame f = new Frame();
        setSize(100, 200);
        Label l = new Label("Enter your Name");
        l.setBounds(30, 60, 200, 100);
        l.setFont(new Font("TimesRoman", Font.BOLD, 20));
        TextField tf = new TextField();
        tf.setBounds(30, 160, 200, 30);
        add(l);
        add(tf);
        setSize(300,300);
        setLayout(null);
        setVisible(true);
    }
    public static void main(String[] args) {
        new nine();
        
    }
    
}
