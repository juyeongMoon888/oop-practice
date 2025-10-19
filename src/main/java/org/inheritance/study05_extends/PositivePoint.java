package org.inheritance.study05_extends;

public class PositivePoint extends Point{
    public PositivePoint(int x, int y) {
        super(Math.max(1, x), Math.max(1, y));
    }

    @Override
    public void move(int x, int y) {
        if (x > 0 && y > 0) {
            super.move(x, y);
        }
    }

    @Override
    public String toString() {
        return "("+super.getX()+","+super.getY()+")의 점";
    }
}
