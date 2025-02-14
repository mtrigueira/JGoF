package org.example.gof.behaviour.mediator;

class Colleague {
    public final Mediator mediator;
    boolean wasOperationCalled = false;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
        mediator.add(this);
    }

    ;

    public void operation() {
        wasOperationCalled = true;
        mediator.notify1(this);
    }
}
