package org.example.gof.behaviour.state;

class Context {
    final State stateA = new State();
    final State stateB = new State();
    private State state = stateA;

    void request() {
        state.handle();
        if (state.equals(stateA))
            state = stateB;
    }
}
