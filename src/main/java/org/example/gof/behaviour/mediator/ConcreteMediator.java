package org.example.gof.behaviour.mediator;

import java.util.ArrayList;
import java.util.List;

class ConcreteMediator implements Mediator {
    private final List<Colleague> colleagues = new ArrayList<>();

    @Override
    public void notify1(Colleague from) {
        if (colleagues.indexOf(from) == 1)
            return;

        // non-germain only operate on second colleague
        colleagues.get(1).operation();
    }

    @Override
    public void add(Colleague colleague) {
        colleagues.add(colleague);
    }
}
