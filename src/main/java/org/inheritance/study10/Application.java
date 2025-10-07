package org.inheritance.study10;

public class Application {
    public static void main(String[] args) {
        A x = new D();
        System.out.println(x instanceof B);
        System.out.println(x instanceof C);

        System.out.println(new D() instanceof Object);
        System.out.println("Java" instanceof Object);
    }
}
