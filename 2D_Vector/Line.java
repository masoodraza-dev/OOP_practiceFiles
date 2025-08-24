public class Line {
    private Vector2D start;
    private Vector2D end;

    public Line(Vector2D start, Vector2D end) {
        this.start = start;
        this.end = end;
    }

    public Vector2D getStart() {
        return start;
    }

    public Vector2D getEnd() {
        return end;
    }
}
