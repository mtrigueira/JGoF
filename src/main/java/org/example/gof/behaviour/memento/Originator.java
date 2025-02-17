package org.example.gof.behaviour.memento;

class Originator {
    String state = "original";

    Memento memento() {
        return new Memento(state);
    }

    public void recall(Memento memento) {
        state = memento.secretState;
    }
}
