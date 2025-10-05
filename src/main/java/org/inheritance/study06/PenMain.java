package org.inheritance.study06;

public class PenMain {
    public static void main(String[] args) {
        SharpPencil sharpPencil = new SharpPencil();
        sharpPencil.setWidth(7);
        sharpPencil.setAmount(10);
        System.out.println("sharpPencil 수량: " + sharpPencil.getAmount() + " 굵기: " + sharpPencil.getWidth()+"mm");

        BallPen ballPen = new BallPen();
        ballPen.setAmount(20);
        ballPen.setColor("blue");
        System.out.println("ballPen 색상:" + ballPen.getColor() + " 수량:" + ballPen.getAmount());

        FountainPen fountainPen = new FountainPen();
        fountainPen.setAmount(40);
        fountainPen.setColor("red");
        System.out.println("fountainPen 색상:" + fountainPen.getColor() + " 수량:" + fountainPen.getAmount());
        fountainPen.setAmount(0);
        System.out.println("fountainPen 소모 후 보충 전: " + fountainPen.getAmount());
        fountainPen.refill(40);
        System.out.println("fountainPen 보충 후: " + fountainPen.getAmount());
    }
}
