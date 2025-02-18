package org.example.gof.behaviour.state;

class State {
    boolean wasHandleCalled = false;

    public void handle() {
        wasHandleCalled = true;
    }
}
