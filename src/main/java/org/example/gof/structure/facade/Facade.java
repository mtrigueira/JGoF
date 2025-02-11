package org.example.gof.structure.facade;

import org.example.gof.structure.facade.blackbox.Complexity;
import org.example.gof.structure.facade.blackbox.Hidden;

class Facade {
    Hidden hidden = new Hidden();
    Complexity complexity = new Complexity();

    public void operation() {
        hidden.secretOperation();
        complexity.complexOperation();
    }
}
