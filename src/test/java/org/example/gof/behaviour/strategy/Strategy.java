package org.example.gof.behaviour.strategy;

class Strategy {
    private final int numberOfTimestToCallContextInterface;

    public Strategy(int numberOfTimestToCallContextInterface) {
        this.numberOfTimestToCallContextInterface = numberOfTimestToCallContextInterface;
    }

    void algorithmInterface(Context context) {
        for (int i = 0; i < numberOfTimestToCallContextInterface; i++)
            context.contextInterface();
    }
}
