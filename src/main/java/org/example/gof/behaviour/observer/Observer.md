```mermaid
---
title: Observer
---
classDiagram
    class Subject~T~ {
        attach(Observer)
        notifyObservers()
        T getState()
    }
    class Observer {
        <<interface>>
        update()*
    }
    class ConcreteSubject~State~ {
        State state()
    }
    class ConcreteObserver {
        update()
    }

    Subject <|-- ConcreteSubject
    Observer <|-- ConcreteObserver
    Subject --> Observer
    ConcreteObserver --> ConcreteSubject
```

Java has a final notify method on object so we rename to notifyObservers.

Although pragmatically one might want to address several observers, but this is
already covered in the composite pattern, so to simplify we only show one
observer.

This is the Pull model. The Observer gets no clue from the notification about
what has changed, and so must "pull" the state it wants from the Subject.

In the Push model a detailed state is set with the notification.

Between this the notifications can be of different granularity. This could be 
achieved using different set of notification and state. GoF calls these aspects.

A cute way of doing this is to add a generic to Observer<T> where T is the State
of interest. The subject could then only notify observers declaring the 
particular T. Since it is an interface, multiple may be declared for the same
ConcreteObserver.

[Return](../../../../../../../../README.md)