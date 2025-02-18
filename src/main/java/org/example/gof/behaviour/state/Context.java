package org.example.gof.behaviour.state;

class Context {
    State stateA = new State();
    State stateB = new State();
    private State state = stateA;

    void request() {
        state.handle();
        if (state.equals(stateA))
            state = stateB;
    }
}
