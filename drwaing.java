
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class drwaing extends JFrame {
    private DrawingCanvas canvas;
    private ArrayList<Shape> shapes;

    public drwaing() {
        setTitle("Drawing Application");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800, 600);

        canvas = new DrawingCanvas();
        shapes = new ArrayList<>();
        add(canvas);
    }

    private class DrawingCanvas extends JPanel {
        private Point startPoint;
        private Point endPoint;

        public DrawingCanvas() {
            setBackground(Color.WHITE);

            addMouseListener(new MouseAdapter() {
                public void mousePressed(MouseEvent e) {
                    startPoint = e.getPoint();
                }

                public void mouseReleased(MouseEvent e) {
                    endPoint = e.getPoint();
                    shapes.add(new Line(startPoint, endPoint, canvas.getGraphics().getColor()));
                    repaint();
                }
            });
        }

        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g;
            for (Shape shape : shapes) {
                shape.draw(g2d);
            }
        }
    }

    private abstract class Shape {
        private Color color;

        public Shape(Color color) {
            this.color = color;
        }

        public Color getColor() {
            return color;
        }

        public abstract void draw(Graphics2D g2d);
    }

    private class Line extends Shape {
        private Point startPoint;
        private Point endPoint;

        public Line(Point startPoint, Point endPoint, Color color) {
            super(color);
            this.startPoint = startPoint;
            this.endPoint = endPoint;
        }

        public void draw(Graphics2D g2d) {
            g2d.setColor(getColor());
            g2d.drawLine(startPoint.x, startPoint.y, endPoint.x, endPoint.y);
        }
    }

    public static void main(String[] args) {
        drwaing app = new drwaing();
        app.setVisible(true);
    }
}
