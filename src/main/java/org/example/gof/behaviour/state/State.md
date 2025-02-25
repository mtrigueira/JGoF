```mermaid
---
title: State
---
classDiagram
    class Context {
        request()
    }
    class State {
        <<interface>>
        handle()*
    }
    class StateA {
        handle()
    }
    class StateB {
        handle()
    }
    
    State <--o Context 
    State <|.. StateA
    State <|.. StateB
```
This pattern is associated with State Transitions.

In the example the transitions are handled by the Context. They could be
handled by the states.

Also offered by GoF are table driven approaches credited to Cargill.

[Pattern Catalogue](../../Catalogue.md)