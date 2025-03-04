package org.example.gof.behaviour.interpreter;

class NonTerminal implements Expression {
    boolean thisWasPreviousExpression = false; /* not germain */

    @Override
    public void interpret(Context context) {
        /* not germain */
        context.log += "NonTerminal\n";
    }
}
