public class AStack {
    int[] arr = new int[4];
    int size = 0;

    public AStack() {}

    public AStack(int[] arr, int size) {
        this.arr = arr;
        this.size = size;
    }

    public void doubleArray() {
            int [] newArray = new int[arr.length *2];

            for (int i = 0; i < size; i++) {
                newArray[i] = arr[i];
            }
            arr = newArray;
    }

    public void push(int value) {
        if (size == arr.length) {
            doubleArray();
        }
        arr[size] = value;
        size++;
    }

    public int pop() {
        if (size == 0){
            throw new IndexOutOfBoundsException("Stack is empty");
        }
        int popped = arr[size-1];
        size--;
        return popped;
    }

    public int peek() {
        return arr[size-1];
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public static int lessThanTPushPopAS(double t) {
        int length = 1;

        while (true) {
            AStack arr = new AStack();
            long startTime = System.nanoTime();

            for (int i = 0; i < length; i++) {
                arr.push(3);
            }

            for (int i = 0; i < length; i++) {
                arr.pop();
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
