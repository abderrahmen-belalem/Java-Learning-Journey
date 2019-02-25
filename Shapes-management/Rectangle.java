package Exo1;

public class Rectangle {
    private Point infLeft = new Point(0,0);
    private Point upRight = new Point(0,0);

    public Rectangle(){
        infLeft.setX(0);
        infLeft.setY(0);
        upRight.setX(0);
        upRight.setY(0);
    }

    public Rectangle(Point infLeft, Point upRight) {
        this.infLeft = infLeft;
        this.upRight = upRight;
    }

    public Rectangle(int one, int two, int three, int four){
        this.infLeft.setX(one);
        this.infLeft.setY(two);
        this.upRight.setX(three);
        this.upRight.setY(four);
    }

    public float calculerSurface(){
        float width = Math.abs(infLeft.getX() - upRight.getX()) ;
        float height =Math.abs(infLeft.getY() - upRight.getY());
        return width * height;
    }
}
