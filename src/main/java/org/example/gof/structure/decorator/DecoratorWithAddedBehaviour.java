package org.example.gof.structure.decorator;

class DecoratorWithAddedBehaviour extends Decorator {
    public DecoratorWithAddedBehaviour(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        component.operation();
    }

    public void addedBehaviour() {
        operation();
    }
}
