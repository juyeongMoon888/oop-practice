package org.inheritance.study04.v3;

public class B extends A{
    public B() {// A의 기본 생성자가 없으면 오류 발생
        System.out.println("생성자B");
    }
}
