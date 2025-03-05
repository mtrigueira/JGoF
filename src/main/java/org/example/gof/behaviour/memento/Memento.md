# Memento

Also known as Token

```mermaid
classDiagram
    namespace memento {
        class Memento {
        }
        class Originator {
            memento() Memento
            +recall(memento)
        }
    }
    Memento <.. Originator

```

GoF gives `Memento` a state and getters and setters. We make `Memento` an
interface and banish all knowledge of what it does to `OriginatorMemento`.

The method on `Originator` is renamed from `createMemento()` to `memento()`. The
method `setMemento` is renamed to `recall`.

`Memento` content must be opaque to the caller. The `Memento` is something
requested stored and given back, never inspected.

See also [Command](../command/Command.md), [Iterator](../iterator/Iterator.md)

[Pattern Catalogue](../../Catalogue.md)