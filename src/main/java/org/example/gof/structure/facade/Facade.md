```mermaid
---
title: Facade
---
classDiagram
    class Facade {
        operation()
    }
    namespace blackbox {
        class Hidden {
        }
        class Complexity {
        }
    }

    Facade --> Complexity
    Facade --> Hidden 
```

[Pattern Catalogue](../../Catalogue.md)