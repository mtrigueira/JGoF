package org.example.gof.creation.singleton;

class Singleton {
    protected static Singleton INSTANCE = new Singleton();

    public static Singleton instance() {
        return INSTANCE;
    }
}
