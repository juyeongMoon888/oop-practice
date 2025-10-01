package org.inheritance.study02;

public class ColorPoint extends Point{
    private String color; //점의 색
    public void setColor(String color) {
        this.color = color;
    }

    public void showColorPoint() {
        System.out.print(color);
        showPoint();
    }
}
