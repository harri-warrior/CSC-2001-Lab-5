public class LLQueue<T> {
    private Node<T> head;

    public LLQueue(Node<T> head) {
        this.head = head;
    }
    public LLQueue() {}

    public LLQueue<T> emptyQueue(){
        return new LLQueue<T>();
    }

    public T peek () {
        return head.first();
    }

    public Node<T> getHead () {
        return head;
    }

    public int size() {
        Node<T> list = this.head;
        return convertToSize(list);
    }

    private int convertToSize(Node<T> node) {
        return switch (node) {
            case null -> 0;
            case Node<T> n -> 1 + convertToSize(n.rest());
        };
    }

    public T dequeue() {
        Node<T> removed = this.head;
        this.head = head.rest();
        return removed.first();
    }

    public void enqueue(T e) {
        this.head = Node.addToEnd(head, e);
    }
}
