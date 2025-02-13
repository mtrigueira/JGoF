package org.example.gof.behaviour.interpreter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class InterpreterTest {
    @Test
    void test() {
        Expression expression = new Terminal();
        Context context = new Context();

        assertFalse(((Terminal) expression).thisWasPreviousExpression);
        assertNull(context.lastExpression);
        expression.interpret(context);

        assertFalse(((Terminal) expression).thisWasPreviousExpression);
        assertNotNull(context.lastExpression);
        expression.interpret(context);

        assertTrue(((Terminal) expression).thisWasPreviousExpression);
    }
}
