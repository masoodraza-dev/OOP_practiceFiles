public class Vector2D {
    public float x;
    public float y;

    public Vector2D() {
        x = 0;
        y = 0;
    }

    public Vector2D(float v1, float v2) {
        x = v1;
        y = v2;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    @Override
    public String toString() {
        return " x " + this.getX() + " y " + this.getY();
    }
}
