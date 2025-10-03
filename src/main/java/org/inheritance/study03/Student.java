package org.inheritance.study03;

public class Student extends Person {

    public void set() {
        age = 30; // 슈퍼클래스 접근
        height = 175; // 슈퍼클래스 접근
        name = "홍길동"; // 슈퍼클래스 접근
        setWeight(99); //private 접근 X
    }
    public static void main(String[] args) {
        Student s = new Student();
        s.set();
    }
}
