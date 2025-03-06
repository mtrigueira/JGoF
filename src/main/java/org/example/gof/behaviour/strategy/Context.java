package org.example.gof.behaviour.strategy;

class Context {
    int numberOfTimesContextInterfaceCalled = 0;

    public void executeStrategy(Strategy strategy) {
        strategy.algorithmInterface(this);
    }

    public void contextInterface() {
        numberOfTimesContextInterfaceCalled++;
    }
}
