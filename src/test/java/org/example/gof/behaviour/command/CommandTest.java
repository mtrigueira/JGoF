package org.example.gof.behaviour.command;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CommandTest {
    @Test
    void test() {
        Command command = new Concrete();

        assertFalse(((Concrete) command).executeCalled);
        command.execute();
        assertTrue(((Concrete) command).executeCalled);
    }
}
