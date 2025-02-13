package org.example.gof.behaviour.command;

class Concrete implements Command {
    boolean executeCalled = false;

    @Override
    public void execute() {
        executeCalled = true;
    }
}
