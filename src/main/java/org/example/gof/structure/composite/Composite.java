package org.example.gof.structure.composite;

import java.util.ArrayList;
import java.util.Collection;

class Composite implements Component {
    final Collection<Component> children = new ArrayList<>();

    @Override
    public void operation() {
        children.forEach(Component::operation);
    }
}
