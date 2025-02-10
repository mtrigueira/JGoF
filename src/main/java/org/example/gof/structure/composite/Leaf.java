package org.example.gof.structure.composite;

final class Leaf implements Component {
    boolean operationCalled = false;

    @Override
    public void operation() {
        operationCalled = true;
    }
}
