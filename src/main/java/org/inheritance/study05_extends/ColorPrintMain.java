package org.inheritance.study05_extends;

public class ColorPrintMain {
    public static void main(String[] args) {
        ColorPrint cp = new ColorPrint(5, 5, "RED");
        cp.setXY(10, 20);
        cp.setColor("BLUE");
        String str = cp.toString();
        System.out.println(str + "입니다.");
    }
}
