import java.util.ArrayList;

public class Turtle {
    private Point currentPosition;
    private double angle;
    private ArrayList<Line> lines;

    public Turtle() {
        this.currentPosition = new Point(0, 0);
        this.angle = 0.0;
        this.lines = new ArrayList<>();
    }

    public void moveTo(Point newPosition) {
        this.currentPosition = newPosition;
    }

    public void lineTo(Point newPosition) {
        Line newLine = new Line(currentPosition, newPosition);
        lines.add(newLine);
        currentPosition = newPosition;
    }

    public void turn(double degrees) {
        this.angle = this.angle + degrees;
    }

    public void forward(double distance) {
        double rad = Math.toRadians(angle);
        double newX = currentPosition.getX() + (distance * Math.cos(rad));
        double newY = currentPosition.getY() + (distance * Math.sin(rad));
        lineTo(new Point((int) newX, (int) newY)); // here int is typecasting of double ==> converts double type value
                                                   // to integer type
    }

    public ArrayList<Line> getPath() {
        return new ArrayList<>(lines); // copying lines to new arrayList
    }

    public void reset() {
        this.currentPosition = new Point(0, 0);
        this.angle = 0.0;
        lines.clear();
    }

}
