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
}
