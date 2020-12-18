package Stack;


public class ArrayStack {
    private int top;
    private int[] storage;

    ArrayStack(int capacity) {
        if (capacity <= 0)
            throw new IllegalArgumentException(
                    "Stack's capacity must be positive");
        storage = new int[capacity];
        top = -1;
    }

    void push(int value) {
        if (top == storage.length)
            throw new StackException("Stack's underlying storage is overflow");
        top++;
        storage[top] = value;
    }


    int pop() {
        if (isEmpty())
            throw new StackException("Stack is empty");
        int val = storage[top];
        top--;
        return val;
    }


    int peek() {
        if (top == -1)
            throw new StackException("Stack is empty");
        return storage[top];
    }

    boolean isEmpty() {
        return (top == -1);
    }

    public class StackException extends RuntimeException {
        public StackException(String message) {
            super(message);
        }
    }
}
