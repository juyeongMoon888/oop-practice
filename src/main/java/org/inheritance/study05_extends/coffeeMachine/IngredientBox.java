package org.inheritance.study05_extends.coffeeMachine;

public class IngredientBox extends Box{
    private String name;
    public IngredientBox(String name, int size) {
        super(size);
        this.name = name;
    }

    @Override
    public boolean consume() {
        return false;
    }

    @Override
    public void print() {
        super.getSize();
    }
}
