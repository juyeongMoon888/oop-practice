package org.inheritance.study07;

public class UpcastingEx {
    public static void main(String[] args) {
        Person p;
        Student s = new Student("이재문");

        p = s;
        System.out.println(p.name);

        //p.grade // 컴파일 오류 - 부모는 자식을 모른다.
    }
}
