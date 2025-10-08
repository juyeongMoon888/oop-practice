package org.inheritance.study13;

class SubObject extends SuperObject {
    @Override
    public void paint() {
        super.draw();
    }

    @Override
    public void draw() {
        System.out.println("Sub Object");
    }
}
