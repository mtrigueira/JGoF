package org.example.gof.behaviour.observer;

class Subject {
    private Observer observer;

    void attach(Observer observer) {
        this.observer = observer;
    }

    void notifyObservers() {
        if (observer != null)
            observer.update();
    }

    public void detach(Observer observer) {
        this.observer = null;
    }
}
