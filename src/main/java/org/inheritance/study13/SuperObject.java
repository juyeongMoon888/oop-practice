package org.inheritance.study13;

class SuperObject {
    public void paint() {
        draw();
    }

    public void draw() {
        draw();
        System.out.println(this.getClass()); //SubObject
        System.out.println("Super Object");
    }
}
