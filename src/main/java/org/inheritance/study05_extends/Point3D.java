package org.inheritance.study05_extends;

public class Point3D extends Point{
    int z = 0;
    Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    public void moveUp(int n) {
        z = z+n;
    }

    public void moveDown(int n) {
        z = z-n;
    }

    public void move(int x, int y, int z) {
        super.move(x, y);
        this.z = z;
    }
    @Override
    public String toString() {
        return "("+super.getX()+","+super.getY()+","+z+")의 점";
    }
}
