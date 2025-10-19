package org.inheritance.study05_extends;

public class ColorPrintMain {
    /*public static void main(String[] args) {
        ColorPrint cp = new ColorPrint(5, 5, "RED");
        cp.setXY(10, 20);
        cp.setColor("BLUE");
        String str = cp.toString();
        System.out.println(str + "입니다.");
    }*/
    /*public static void main(String[] args) {
        ColorPoint2 zeroPoint = new ColorPoint2(); // (0,0) 위치의 "WHITE" 색 점
        System.out.println(zeroPoint.toString() + "입니다.");

        ColorPoint2 cp = new ColorPoint2(10, 10, "RED");

        cp.set("BLUE");
        cp.set(10, 20);
        System.out.println(cp.toString() + "입니다.");
        ColorPoint2 thresholdPoint = new ColorPoint2(100, 100); //(100, 100) 위치의 "BLACK"점
        System.out.println("cp에서 임계점까지의 거리는 " + cp.getDistance(thresholdPoint));
    }*/
    /*public static void main(String[] args) {
        Point3D p = new Point3D(3, 2, 1);
        System.out.println(p.toString() + "입니다.");

        p.moveUp(3);
        System.out.println(p.toString() + "입니다.");
        p.moveDown(2);
        System.out.println(p.toString() + "입니다.");
        p.move(5, 5);
        System.out.println(p.toString() + "입니다.");
        p.move(100, 200, 300);
        System.out.println(p.toString() + "입니다.");
    }*/
    public static void main(String[] args) {
        PositivePoint p = new PositivePoint(10, 10); // (10, 10)의 점
        p.move(5, 5); // p는 (5, 5)점
        System.out.println(p.toString() + "입니다.");

        p.move(2, -2); // 점 p는 양수 공간만 가능. 그러므로 이동 없음
        System.out.println(p.toString() + "입니다.");

        PositivePoint q = new PositivePoint(-10, -10); //음수 점 불가. 디폴트(1, 1)의 점 생성

        System.out.println(q.toString() + "입니다.");
    }


}
