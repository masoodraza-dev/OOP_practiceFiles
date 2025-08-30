import java.awt.*;

public class Line {
    private Point start;
    private Point end;

    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    public Line(Line other) {
        this.start = new Point(other.start);
        this.end = new Point(other.end);
    }

    public Point getStart() {
        return start;
    }

    public Point getEnd() {
        return end;
    }

    public double length() {
        return start.distance(end);
    }

    public Point midPoint() {
        return start.midPoint(end);
    }

    public double slope() {
        return start.slope(end);
    }

    public Line translate(int dx, int dy) {
        Point newStart = start.translate(dx, dy);
        Point newEnd = end.translate(dx, dy);
        return new Line(newStart, newEnd);
    }

    public void draw(Graphics g) {
        g.drawLine(start.getX(), start.getY(), end.getX(), end.getY());
    }

    public String toString() {
        return "Start: " + start + ", End " + end;
    }

}
