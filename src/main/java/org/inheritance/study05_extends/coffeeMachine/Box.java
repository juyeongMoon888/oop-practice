package org.inheritance.study05_extends.coffeeMachine;

abstract class Box {
    protected int size;
    public Box(int size) { //현재 박스에 들어 있는 재료의 양
        this.size = size; // 생성자
    }
    public boolean isEmpty(){
        return size == 0; // 박스가 빈 경우 true 리턴
    }

    public int getSize() {
        return size;
    }

    public abstract boolean consume(); // 박스에 들어 있는 재료를 일정량 소비
    public abstract void print(); // 박스에 들어 있는 링을 "*" 문자로 출력
}
