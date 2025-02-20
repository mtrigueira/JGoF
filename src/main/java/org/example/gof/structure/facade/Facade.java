package org.example.gof.structure.facade;

import org.example.gof.structure.facade.blackbox.Complexity;
import org.example.gof.structure.facade.blackbox.Hidden;

class Facade {
    final Hidden hidden = new Hidden();
    final Complexity complexity = new Complexity();

    public void operation() {
        hidden.secretOperation();
        complexity.complexOperation();
    }
}
