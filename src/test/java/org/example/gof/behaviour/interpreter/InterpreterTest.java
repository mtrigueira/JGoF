package org.example.gof.behaviour.interpreter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class InterpreterTest {
    @Test
    void test() {
        Terminal terminal = new Terminal();
        NonTerminal nonTerminal = new NonTerminal();
        Context context = new Context();
        String log = "";
        Expression expression;

        assertFalse(terminal.thisWasPreviousExpression);
        assertFalse(nonTerminal.thisWasPreviousExpression);
        assertEquals(log, context.log);
        expression = nonTerminal;

        expression.interpret(context);

        log += "NonTerminal\n";
        assertEquals(log, context.log);

        expression = terminal;
        expression.interpret(context);

        log += "Terminal\n";
        assertEquals(log, context.log);
    }
}
