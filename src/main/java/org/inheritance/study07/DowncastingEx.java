package org.inheritance.study07;

public class DowncastingEx {
    public static void main(String[] args) {
        Person p = new Student("이재문");

        Student s = (Student) p;

        System.out.println(s.name); //오류 없음 - 자식은 부모의 가질 수 있음.
        s.grade = "A";
    }
}
