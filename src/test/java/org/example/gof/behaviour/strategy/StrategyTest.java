package org.example.gof.behaviour.strategy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StrategyTest {
    @Test
    void testStrategy() {
        Context context = new Context();
        context.executeStrategy(new Strategy(5){});
        assertEquals(5, context.numberOfTimesContextInterfaceCalled);

        context = new Context();
        context.executeStrategy(new Strategy(2){});
        assertEquals(2, context.numberOfTimesContextInterfaceCalled);
    }
}
