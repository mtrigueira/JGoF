package org.example.gof.creation.singleton;

class Singleton implements Interface {
    private static Interface instance = new Singleton();

    public static Interface instance() {
        return instance;
    }

    public static void setInstance(Interface instance) {
        Singleton.instance = instance;
    }

    private Singleton() {}
}
