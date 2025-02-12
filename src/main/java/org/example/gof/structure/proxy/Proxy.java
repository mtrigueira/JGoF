package org.example.gof.structure.proxy;

class Proxy implements Subject {
    Subject realSubject;

    @Override
    public void operation() {
        if (realSubject == null)
            realSubject = new RealSubject();

        realSubject.operation();
    }
}
