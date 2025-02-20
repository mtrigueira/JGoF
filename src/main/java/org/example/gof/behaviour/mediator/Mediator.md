```mermaid
---
title: Mediator
---
classDiagram
    class ColleageA {
    }
    class ColleageB {
    }
    class Colleague {
        Mediator~Colleague~ mediator
        operation()
    }
    class ConcreteMediator~Colleague~ {
        Collection~Collegue~ collegues
        operation()
    }
    class Mediator~T~ {
        <<interface>>
        notify1(from:T)*
    }
    
    Colleague <-- ColleageA
    Colleague <-- ColleageB
    ConcreteMediator --> ColleageA
    ColleageA --> ConcreteMediator 
    ConcreteMediator --> ColleageB
    ColleageB --> ConcreteMediator
    Mediator <|.. ConcreteMediator
```
We cant call the method notify() since java has a final method notify() on
Object. 

The Colleagues communicate with each-other via the interface offered by the
Mediator. The Mediator communicates with the Colleagues via the Colleague
interface.

The Colleague class could be an interface, and ColleagueA and B implementors, but 
for the example Colleague is a class, and A and B instances.

This is an extension of the Facade (playing the part of Mediator) where the
objects hidden behind the Facade also make use of the Facade themselves.

[Return](../../../../../../../../README.md)