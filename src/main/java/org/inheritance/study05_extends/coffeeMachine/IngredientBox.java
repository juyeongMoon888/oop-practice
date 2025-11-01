package org.inheritance.study05_extends.coffeeMachine;

public class IngredientBox extends Box{
    private String name;
    public IngredientBox(String name, int size) {
        super(size);
        this.name = name;
    }

    @Override
    public boolean consume() {
        if (super.size > 0) {
            return true;
        }
        return false;
    }

    @Override
    public void print() {
        for (int i = 0; i < super.size; i++) {
            System.out.print("*");
        }
    }

    public String getName() {
        return name;
    }

    public void setSize(int size) {
        if (consume()) {
            super.size -= size;
        }
    }
}
