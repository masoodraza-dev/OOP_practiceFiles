import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Canvas extends JPanel {
    private Turtle turtle;

    public Canvas(Turtle turtle) {
        this.turtle = turtle;
        setBackground(Color.WHITE);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(2));

        ArrayList<Line> path = turtle.getPath();
        for (Line line : path) {
            Point start = line.getStart();
            Point end = line.getEnd();

            g.drawLine(start.getX(), start.getY(), end.getX(), end.getY());

        }
    }

}
