package org.example.gof.behaviour.interpreter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class InterpreterTest {
    @Test
    void test() {
        Expression expression = new Terminal();
        //terminal is used for testing purposes
        //noinspection CastCanBeRemovedNarrowingVariableType
        Terminal terminal = (Terminal) expression;
        Context context = new Context();

        assertFalse(terminal.thisWasPreviousExpression);
        assertNull(context.lastExpression);
        expression.interpret(context);

        assertFalse(terminal.thisWasPreviousExpression);
        assertNotNull(context.lastExpression);
        expression.interpret(context);

        assertTrue(terminal.thisWasPreviousExpression);
    }
}
