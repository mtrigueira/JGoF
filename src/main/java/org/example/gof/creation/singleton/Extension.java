package org.example.gof.creation.singleton;

class Extension implements Interface {
    private static Interface instance = new Extension();
    public static Interface instance() {
        return instance;
    }

    private Extension() {}
}
