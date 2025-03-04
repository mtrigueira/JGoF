package org.example.gof.behaviour.chain;

class Concrete implements Handler {
    private final Handler successor;
    boolean handleRequestCalled = false;

    public Concrete(Handler successor) {this.successor = successor;}

    @Override
    public void handleRequest() {
        handleRequestCalled = true;

        if (successor != null)
            successor.handleRequest();
    }
}
