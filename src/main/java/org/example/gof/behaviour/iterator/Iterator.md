```mermaid
---
title: Interator
---
classDiagram
    class Iterable~T~ {
        <<interface>>
        Iterator~T~ iterator()*
    }
    class Iterator~T~ {
        <<interface>>
        T next()*
        boolean hasNext()*
    }
    namespace implementation {
        class ConcreteIterable~T~ {
            Iterator~T~ iterator()
        }
        class ConcreteIterator {
        }
    }

    Iterable <|.. ConcreteIterable
    Iterator <|.. ConcreteIterator
    ConcreteIterator <-- ConcreteIterable
```
GoF names an Aggregator class, we will javafy it to Iterable<T>. GoF calls the
method in Aggregator createIterator, we'll use iterator. 

On the Iterator GoF have a first method. We will omit. GoF also has a separate 
currentItem method, we will omit too. We will update next() to return a value of
the generic type. GoF calls this is an active iterator crediting Booch.

We'll also rename their isDone() to hasNext().

GoF suggest making the interface even smaller merging hasNext() and returning a 
special value. If you are tempted by this optimisation don't return a null. You 
will throw a null pointer exception when you forget to check. Another sneaky and
not recommended option would be to expect a NoElementException to be thrown.

[Return](../../../../../../../../README.md)