package org.example.gof.structure.decorator;

class Concrete implements Component {
    boolean operationCalled = false;

    @Override
    public void operation() {
        operationCalled = true;
    }
}
