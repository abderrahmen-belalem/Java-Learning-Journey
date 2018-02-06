package Exo1;

public class Point {
    private float x, y;

    @Override
    public String toString() {
        return "Le point: " + getClass().getName() + " (" + x + "," + y + ")";
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }
}
