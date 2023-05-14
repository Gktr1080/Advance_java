import java.awt.*;

public class eleventh {
    public static void main(String[] args) {
        Frame f = new Frame();
        f.setSize(1500, 1500);
        Label l1 = new Label("Choose Your Favorite Language:");
        l1.setFont(new Font("TimesRoman", Font.BOLD, 20));
        l1.setBounds(100, 150, 200, 30);
        Choice ch = new Choice();
        ch.setBounds(100, 200, 50, 30);
        ch.add("Java");
        ch.add("Python");
        ch.add("C#");
        ch.add("C/C++");

        f.add(l1);
        f.add(ch);

        f.setLayout(null);
        f.setVisible(true);

    }

}
