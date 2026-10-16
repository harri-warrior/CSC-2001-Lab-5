public class AQueue<T> {
    private T[] array;
    private int front;
    private int size;
    private int capacity;

    public AQueue(int capacity) {
        this.capacity = capacity;
        this.array = (T[]) new Object[capacity];
        this.front = 0;
        this.size = 0;
    }

    public AQueue() {
        this(10);
    }

    public AQueue<T> emptyQueue() {
        return new AQueue<T>();
    }

    public T peek() {
        if (size == 0) {
            throw new IndexOutOfBoundsException("Queue is empty");
        }
        return array[front];
    }

    public int size() {
        return size;
    }

    public T dequeue() {
        if (size == 0) {
            throw new IndexOutOfBoundsException("Queue is empty");
        }
        T removed = array[front];
        array[front] = null;
        front = (front + 1) % capacity;
        size--;

        return removed;
    }

    public void enqueue(T e) {
        if (size == capacity) {
            doubleCapacity();
        }
        int end = (front + size) % capacity;
        array[end] = e;
        size++;
    }

    private void doubleCapacity() {
        T[] newArray = (T[]) new Object[capacity * 2];

        for (int i = 0; i < size; i++) {
            newArray[i] = array[(front + i) % capacity];
        }

        array = newArray;
        capacity *= 2;
        front = 0;
    }
}