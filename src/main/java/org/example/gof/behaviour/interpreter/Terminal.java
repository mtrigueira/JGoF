package org.example.gof.behaviour.interpreter;

class Terminal implements Expression {
    boolean thisWasPreviousExpression = false; /* not germain */

    @Override
    public void interpret(Context context) {
        /* not germain */
        context.log += "Terminal\n";
    }
}
