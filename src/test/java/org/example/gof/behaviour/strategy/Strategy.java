package org.example.gof.behaviour.strategy;

class Strategy {
    private final int numberOfTimesToCallContextInterface;

    public Strategy(int numberOfTimesToCallContextInterface) {
        this.numberOfTimesToCallContextInterface = numberOfTimesToCallContextInterface;
    }

    void algorithmInterface(Context context) {
        for (int i = 0; i < numberOfTimesToCallContextInterface; i++)
            context.contextInterface();
    }
}
