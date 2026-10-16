import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    // Linked list stack tests

    @Test
    public void testLLSEmptyStack() {
        LLStack<Integer> stack = new LLStack<>(null);

        assertTrue(stack.isEmpty());
        assertEquals(0, stack.size());
    }

    @Test
    public void testLLSPush() {
        LLStack<Integer> stack = new LLStack<>(null);

        stack.push(10);

        assertEquals(10, stack.peek());
    }

    @Test
    public void testLLSPushMultiple() {
        LLStack<Integer> stack = new LLStack<>(null);

        stack.push(10);
        stack.push(20);
        stack.push(30);

        assertEquals(30, stack.peek());
    }

    @Test
    public void testLLSPop() {
        LLStack<Integer> stack = new LLStack<>(null);

        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.pop();

        assertEquals(20, stack.peek());
    }

    @Test
    public void testLLSPopUntilEmpty() {
        LLStack<Integer> stack = new LLStack<>(null);

        stack.push(10);
        stack.push(20);

        stack.pop();
        stack.pop();

        assertTrue(stack.isEmpty());
        assertEquals(0, stack.size());
    }

    @Test
    public void testLLSPeekDoesNotRemove() {
        LLStack<Integer> stack = new LLStack<>(null);

        stack.push(42);

        assertEquals(42, stack.peek());
    }

    // Array stack tests

    @Test
    public void testASEmptyStack() {
        AStack stack = new AStack();

        assertTrue(stack.isEmpty());
        assertEquals(0, stack.size());
    }

    @Test
    public void testASPush() {
        AStack stack = new AStack();

        stack.push(10);

        assertEquals(10, stack.peek());
    }

    @Test
    public void testASPushMultiple() {
        AStack stack = new AStack();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        assertEquals(30, stack.peek());
    }

    @Test
    public void testASPop() {
        AStack stack = new AStack();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.pop();

        assertEquals(20, stack.peek());
    }

    @Test
    public void testASPopUntilEmpty() {
        AStack stack = new AStack();

        stack.push(10);
        stack.push(20);

        stack.pop();
        stack.pop();

        assertTrue(stack.isEmpty());
        assertEquals(0, stack.size());
    }

    @Test
    public void testASPeekDoesNotRemove() {
        AStack stack = new AStack();

        stack.push(42);

        assertEquals(42, stack.peek());
    }

    //Linked list queue tests

    @Test
    public void testEmptyQueue() {
        LLQueue<Integer> first = new LLQueue<>();
        first = first.emptyQueue();
        assertEquals(0, first.size());
    }

    @Test
    public void testSize() {
        LLQueue<Integer> first = new LLQueue<>(
                new Node<Integer>(
                        1,
                        null
                )
        );
        assertEquals(1, first.size());
    }

    @Test
    public void testPeek() {
        Node<Integer> firstNode = new Node<Integer>(2,null);
        LLQueue<Integer> first = new LLQueue<>(
                firstNode
        );
        assertEquals(2, first.peek());
    }

    @Test
    public void testEnqueue() {
        LLQueue<Integer> first = new LLQueue<>(
                new Node<Integer>(
                        2,
                        new Node<Integer>(
                                3,
                                null
                        )
                )
        );
        LLQueue<Integer> second = new LLQueue<>(
                new Node<Integer>(
                        2,
                        null
                )
        );

        second.enqueue(3);
        assertTrue(Node.equals(first.getHead(),second.getHead()));
    }

    @Test
    public void testDequeue() {
        LLQueue<Integer> first = new LLQueue<>(
                new Node<Integer>(
                        2,
                        new Node<Integer>(
                                3,
                                null
                        )
                )
        );
        LLQueue<Integer> second = new LLQueue<>(
                new Node<Integer>(
                        3,
                        null
                )
        );

        first.dequeue();
        assertTrue(Node.equals(first.getHead(),second.getHead()));
    }

    // AQueue tests

    @Test
    public void testEmptyAQueue() {
        AQueue<Integer> first = new AQueue<>(0);
        first = first.emptyQueue();
        assertEquals(0, first.size());
    }

    @Test
    public void testAQueueSize() {
        AQueue<Integer> first = new AQueue<>(4);
        first.enqueue(2);
        assertEquals(1, first.size());
    }

    @Test
    public void testAQueuePeek() {
        AQueue<Integer> first = new AQueue<>(4);
        first.enqueue(2);
        assertEquals(2, first.peek());
    }

    @Test
    public void testAQueueEnqueue() {
        AQueue<Integer> first = new AQueue<Integer>(4);

        first.enqueue(3);
        assertEquals(3,first.peek());
    }

    @Test
    public void testAQueueDequeue() {
        AQueue<Integer> first = new AQueue<Integer>(4);

        first.enqueue(3);
        assertEquals(3,first.dequeue());
    }
}
