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

    public String toString() {
        return color + "색의 " + "(" + super.getX() +"," + super.getY() + ")의 점입니다.";
    }

}
