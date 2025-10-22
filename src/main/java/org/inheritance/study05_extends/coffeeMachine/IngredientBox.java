package org.inheritance.study05_extends.coffeeMachine;

public class IngredientBox extends Box{
    public IngredientBox(String name, int size) {
        // 생성자
    }

    @Override
    public boolean consume() {
        return false;
    }

    @Override
    public void print() {

    }
}
