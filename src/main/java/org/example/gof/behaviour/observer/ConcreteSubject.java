package org.example.gof.behaviour.observer;

class ConcreteSubject extends Subject {
    private String state = "original";

    public String state() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
        notifyObservers();
    }
}
