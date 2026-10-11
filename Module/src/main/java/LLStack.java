public class LLStack<T> {
    private Node<T> head;
    private Node<T> end;

    public LLStack(Node<T> head) {
        this.head = head;
    }

    public void push(T value) {
        this.head = Node.addToFront(this.head, value);
    }

    public T pop() {
        if (head == null){
            throw new IndexOutOfBoundsException();
        }
        this.head = head.rest();
        return head.first();
    }

    public T peek() {
        return head.first();
    }

    public int size() {
        return Node.getSize(head);
    }

    public Boolean isEmpty() {
        return head == null;
    }

    public static int lessThanTPushPopLLS(double t) {
        int length = 1;

        while (true) {
            LLStack<Integer> list = new LLStack<>(new Node<>(null, null));
            long startTime = System.nanoTime();

            for (int i = 0; i < length; i++) {
                list.push(3);
            }

            for (int i = 0; i < length; i++) {
                list.pop();
            }

            long endTime = System.nanoTime();
            long duration = ((endTime - startTime) / 1000000);
            if (duration >= t) {
                return length / 2;
            }
            length = length * 2;
        }
    }
}
