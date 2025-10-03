package org.inheritance.study04.v6;

public class B extends A{
    public B(){
        super(30);
        System.out.println("생성자B");//실행됨
    }
    public B(int x) {
        System.out.println("매개변수생성자B" + x);
    }
}
