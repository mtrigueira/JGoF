package org.example.gof.creation.singleton;

class Singleton {
    protected static Singleton INSTANCE = new Singleton();
    private int counter = 0;

    public static Singleton instance() {
        INSTANCE.counter++;
        return INSTANCE;
    }
}
