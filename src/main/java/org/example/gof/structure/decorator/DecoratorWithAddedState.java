package org.example.gof.structure.decorator;

class DecoratorWithAddedState extends Decorator {
    boolean addedState = false;

    public DecoratorWithAddedState(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        component.operation();
        addedState = true;
    }
}
