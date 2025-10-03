package org.inheritance.study04.v5;

public class B extends A{
    public B() {
        System.out.println("생성자B");
    }
    public B(int x) {
        super(x); // 첫 줄에 와야함 - 매개변수를 가진 생성자A 로 가라.
        System.out.println("매개변수생성자B");
    }
}
