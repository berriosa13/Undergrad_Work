package Stack;

public class LinkedListStack {
    private Node top;
    private int size;

    LinkedListStack() {
        top = null;
        size = 0;
    }

    void push(int value) {
        Node oldTop = top;
        top = new Node(value);
        top.next = oldTop;
        size ++;
    }


    int pop() {
        if (size == 0)
            throw new StackException("Stack is empty");
        int val = top.data;
        top = top.next;
        size --;
        return val;
    }


    int peek() {
        if (size == 0)
            throw new StackException("Stack is empty");
        return top.data;
    }

    boolean isEmpty() {
        return (size == 0);
    }

    public class StackException extends RuntimeException {
        public StackException(String message) {
            super(message);
        }
    }
}
