package org.inheritance.study05_extends;

public class ColorPrint extends Point{
    private String color;
    ColorPrint(int x, int y, String color){
        super(x, y);

        this.color = color;
    }

    public void setXY(int x, int y) {
        move(x, y);
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        return color + "색의 (" + super.getX() + "," + super.getY() + ")의 점";
    }
}
