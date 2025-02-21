package org.example.gof.structure.facade;

import org.example.gof.structure.facade.blackbox.Complexity;
import org.example.gof.structure.facade.blackbox.Hidden;

class Facade {
    final Hidden hidden;
    final Complexity complexity;

    Facade(Hidden hidden, Complexity complexity) {
        this.hidden = hidden;
        this.complexity = complexity;
    }

    public void operation() {
        hidden.secretOperation();
        complexity.complexOperation();
    }
}
