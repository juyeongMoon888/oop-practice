package org.inheritance.study05_extends;

public class ColorPoint2 extends Point{
    private String color;
    ColorPoint2() {
        super(0,0);
        this.color = "WHITE";
    }
    ColorPoint2(int x, int y, String color) {
        super(x, y);
    }

    ColorPoint2(int x, int y) {
        super(x, y);
    }

    public void set(String color) {
        this.color = color;
    };

    public void set(int x, int y) {
        new ColorPoint2(x, y, this.color);
    }

    public String toString() {
        return color + "색의 " + "(" + super.getX() +"," + super.getY() + ")의 점";
    }

    public double getDistance(ColorPoint2 point) {
        return Math.sqrt((this.getX()-point.getX())*(this.getX()-point.getX())+(this.getY()-point.getY())*(this.getY()-point.getY()));
    }
}
