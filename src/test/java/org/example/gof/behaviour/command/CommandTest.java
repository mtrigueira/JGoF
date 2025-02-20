package org.example.gof.behaviour.command;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CommandTest {
    @Test
    void test() {
        Concrete concrete = new Concrete();
        List<Command> commands = List.of(concrete);

        assertFalse(concrete.executeCalled);
        commands.forEach(Command::execute);
        assertTrue(concrete.executeCalled);
    }
}
