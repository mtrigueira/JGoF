package org.example.gof.creation.singleton;

class Extension extends Singleton {
    static void override() {
        INSTANCE = new Extension();
    }
}
