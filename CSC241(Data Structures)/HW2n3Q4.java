package HWs;

class HW2n3Q4 {
    private static int front, rear, capacity;
    private static int queue[];

    HW2n3Q4(int c) {
        front = rear = 0;
        capacity = c;
        queue = new int[capacity];
    }

    //  Checks to see if the queue is empty or not
    static boolean empty() {
        if (capacity == rear) {
            return true;
        } else return false;
    }

    //  Inserts a new element into the queue
    static void Enqueue(int x) {
        queue[rear] = x;
        rear++;
        return;
    }

    //  Removes the element in the "front" of the queue
    static void Dequeue() {
        for (int i = 0; i < rear - 1; i++) {
            queue[i] = queue[i + 1];
        }
        if (rear < capacity) {
            queue[rear] = 0;
            rear--;
        }
        return;
    }

    //  Prints out the queue after other methods are called
    static void printQueue() {
        int i;
        for (i = front; i < rear; i++) {
            System.out.printf(" %d <-- ", queue[i]);
        }
        return;
    }
    //  Shows which element will be removed after
    //  a Dequeue method is called
    static void peek() {
        System.out.println("\n"+"Next element to be removed after " +
                "Dequeue method is called : " +queue[front]);
    }

}

