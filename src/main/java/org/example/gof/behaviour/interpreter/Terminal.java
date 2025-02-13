package org.example.gof.behaviour.interpreter;

class Terminal implements Expression {
    boolean thisWasPreviousExpression = false; /* not germain */

    @Override
    public void interpret(Context context) {
        /* not germain */
        thisWasPreviousExpression = context.lastExpression == this;
        if (!thisWasPreviousExpression)
            context.lastExpression = this;
    }
}
