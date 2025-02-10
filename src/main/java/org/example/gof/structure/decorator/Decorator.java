package org.example.gof.structure.decorator;

public abstract class Decorator implements Component {
    protected Component component;

    public abstract void operation();
}
