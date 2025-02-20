package org.example.gof.structure.decorator;

public abstract class Decorator implements Component {
    Component component;

    public abstract void operation();
}
