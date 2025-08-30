public class Point {
    private int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point other) {
        this.x = other.x;
        this.y = other.y;
    }

    public void setxy(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setOther(Point other) {
        this.x = other.x;
        this.y = other.y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Point add(Point other) {
        return new Point(this.x + other.x, this.y + other.y);
    }

    public Point subtract(Point other) {
        return new Point(this.x - other.x, this.y - other.y);
    }

    public double distance(Point other) {
        int dx = this.x - other.x;
        int dy = this.y - other.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public Point scale(int factor) {
        int newX = this.x * factor;
        int newY = this.y * factor;
        return new Point(newX, newY);
    }

    public Point rotate(double angleInDegrees) {
        double redian = Math.toRadians(angleInDegrees);
        double newX = x * Math.cos(redian) - y * Math.sin(redian);
        double newY = x * Math.sin(redian) + y * Math.cos(redian);
        return new Point((int) newX, (int) newY);
    }

    public Point midPoint(Point other) {
        int midX = (this.x + other.x) / 2;
        int midY = (this.y + other.y) / 2;
        return new Point(midX, midY);
    }

    public boolean equals(Point other) {
        if (this.x == other.x && this.y == other.y) {
            return true;
        } else {
            return false;
        }
    }

    public Point copy() {
        int copyX = this.x;
        int copyY = this.y; // we also can write this code by skipping these two lines i.e 76,77
        return new Point(copyX, copyY); // the code was ==> return new Point(this.x, this.y);

    }

    public double slope(Point other) {
        if (this.x == other.x) {
            return Double.POSITIVE_INFINITY;
        } else {
            double numerator = other.y - this.y;
            double denominator = other.x - this.x;
            return numerator / denominator;
        }

    }

    public double angle(Point other) {
        double dot = (this.x * other.x) + (this.y * other.y); // DOT PRODUCT

        double magA = Math.sqrt((this.x * this.x) + (this.y * this.y)); // MAGNITUDE OF A ==> |A|
        double magB = Math.sqrt((other.x * other.x) + (other.y * other.y)); // MAGNITUDE OF B ==> |B|
        double cosTheta = dot / (magA * magB);

        return Math.toDegrees(Math.acos(cosTheta));
    }

    public Point translate(int dx, int dy) {
        int newX = this.x + dx;
        int newY = this.y + dy;

        return new Point(newX, newY);
    }

    public Point reflectX() {
        int RX = this.x;
        int RY = -this.y; // OR int RY = this.y * -1;
        return new Point(RX, RY);
    }

    public Point reflectY() {
        int RX = -this.x; // OR int RX = this.x * -1;
        int RY = this.y;
        return new Point(RX, RY);
    }

    public Point reflectOrigin() {
        int RX = -this.x;
        int RY = -this.y;
        return new Point(RX, RY);
    }

    public String toString() {
        return " x " + x + " y " + y;
    }

}
