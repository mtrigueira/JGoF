package org.example.gof.foundation;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class AList {
    private static final Object FIRST_ELEMENT = "FIRST_ELEMENT";
    private static final Object MIDDLE_ELEMENT = "MIDDLE_ELEMENT";
    private static final Object LAST_ELEMENT = "LAST_ELEMENT";
    private List<Object> list;

    @Nested
    class ThatHasJustBeenCreated {
        @Test
        void shouldHaveZeroElements() {
            assertEquals(0, list.count());
        }

        @Test
        void shouldHaveNoElementZero() {
            assertNoSuchElementExceptionThrown(() -> list.get(0));
        }

        @Test
        void shouldHaveNoFirstElement() {
            assertNoSuchElementExceptionThrown(() -> list.first());
        }

        @Test
        void shouldHaveNoLastElement() {
            assertNoSuchElementExceptionThrown(() -> list.last());
        }
    }

    private static void assertNoSuchElementExceptionThrown(Executable executable) {
        assertThrows(NoSuchElementException.class, executable);
    }

    @Nested
    class ThatHasOneElement {
        @BeforeEach
        void setUp() {
            list.append(FIRST_ELEMENT);
        }

        @Test
        void shouldHaveOneElement() {
            assertEquals(1, list.count());
        }

        @Test
        void shouldHaveAnElementZeroThatIsTheInsertedElement() {
            assertEquals(FIRST_ELEMENT, list.get(0));
        }

        @Test
        void shouldHaveAFirstElementThatIsTheInsertedElement() {
            assertEquals(FIRST_ELEMENT, list.first());
        }

        @Test
        void shouldHaveALastElementThatIsTheInsertedElement() {
            assertEquals(FIRST_ELEMENT,  list.last());
        }
    }

    @Nested
    class ThatHasThreeElements {
        @BeforeEach
        void setUp() {
            list.append(FIRST_ELEMENT);
            list.append(MIDDLE_ELEMENT);
            list.append(LAST_ELEMENT);
        }

        @Test
        void shouldHaveThreeElements() {
            assertEquals(3, list.count());
        }

        @Test
        void shouldHaveElementsInTheInsertedOrder() {
            assertEquals(FIRST_ELEMENT, list.get(0));
            assertEquals(MIDDLE_ELEMENT, list.get(1));
            assertEquals(LAST_ELEMENT, list.get(2));
        }

        @Test
        void shouldHaveAFirstElementThatIsTheFirstInsertedElement() {
            assertEquals(FIRST_ELEMENT, list.first());
        }

        @Test
        void shouldHaveALastElementThatIsTheLastInsertedElement() {
            assertEquals(LAST_ELEMENT,  list.last());
        }

        @Nested
        class AndOneElementIsRemoved {
            @Test
            void byName() {
                list.remove(MIDDLE_ELEMENT);

                assertEquals(2, list.count());
                assertEquals(FIRST_ELEMENT, list.get(0));
                assertEquals(LAST_ELEMENT, list.get(1));
                assertNoSuchElementExceptionThrown(()->list.get(2));
            }
            @Test
            void byFirst() {
                list.removeFirst();

                assertEquals(2, list.count());
                assertEquals(MIDDLE_ELEMENT, list.get(0));
                assertEquals(LAST_ELEMENT, list.get(1));
                assertNoSuchElementExceptionThrown(()->list.get(2));
            }
            @Test
            void byLast() {
                list.removeLast();

                assertEquals(2, list.count());
                assertEquals(FIRST_ELEMENT, list.get(0));
                assertEquals(MIDDLE_ELEMENT, list.get(1));
                assertNoSuchElementExceptionThrown(()->list.get(2));
            }
            @Test
            void all() {
                list.removeAll();

                assertEquals(0, list.count());
                assertNoSuchElementExceptionThrown(()->list.get(0));
            }
        }
    }

    @Nested
    class ThatHasTwoPrependedElements {
        @BeforeEach
        void setUp() {
            list.prepend(FIRST_ELEMENT);
            list.prepend(LAST_ELEMENT);
        }

        @Test
        void shouldHaveTwoElements() {
            assertEquals(2, list.count());
        }

        @Test
        void shouldHaveAnElementsInTheReverseInsertedOrder() {
            assertEquals(LAST_ELEMENT, list.get(0));
            assertEquals(FIRST_ELEMENT, list.get(1));
        }

        @Test
        void shouldHaveAFirstElementThatIsTheLastInsertedElement() {
            assertEquals(LAST_ELEMENT, list.first());
        }

        @Test
        void shouldHaveALastElementThatIsTheFirstInsertedElement() {
            assertEquals(FIRST_ELEMENT,  list.last());
        }
    }

    @Nested
    class AsAStack {
        Stack<Object> stack;
        @BeforeEach
        void setUp() {
            stack = list;
            stack.push(FIRST_ELEMENT);
            stack.push(MIDDLE_ELEMENT);
            stack.push(LAST_ELEMENT);
        }

        @Test
        void shouldHaveThreeElements() {
            assertEquals(3, list.count());
        }

        @Test
        void shouldHaveElementsInTheInsertedOrder() {
            assertEquals(LAST_ELEMENT, stack.pop());
            assertEquals(MIDDLE_ELEMENT, stack.pop());
            assertEquals(FIRST_ELEMENT, stack.pop());
        }

        @Test
        void shouldHaveNoElementsLeft() {
            stack.pop();
            stack.pop();
            stack.pop();
            assertEquals(0, list.count());
        }

        @Test
        void shouldHaveNoElementsLeftAndThrowExceptionWhenPop() {
            stack.pop();
            stack.pop();
            stack.pop();
            assertThrows(NoSuchElementException.class, () -> stack.pop());
        }

        @Test
        void shouldHaveCorrectElementOnTop() {
            assertEquals(LAST_ELEMENT, stack.top());
            stack.pop();
            assertEquals(MIDDLE_ELEMENT, stack.top());
            stack.pop();
            assertEquals(FIRST_ELEMENT, stack.top());
        }
    }

    @BeforeEach
    void setUp() {
        list = new List<>(5);
    }
}