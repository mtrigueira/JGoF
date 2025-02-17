package org.example.gof.behaviour.observer;

class ConcreteObserver implements Observer {
    private final ConcreteSubject concreteSubject;
    String concreteSubjectObservedState = "unknown";

    public ConcreteObserver(ConcreteSubject concreteSubject) {
        this.concreteSubject = concreteSubject;
        concreteSubject.attach(this);
        update();
    }

    @Override
    public void update() {
        concreteSubjectObservedState = concreteSubject.state();
    }
}
