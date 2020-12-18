package HWs;
//  As the title described, you should only use two stacks to implement a queue's actions. DO NOT use any
//other data structure and push, pop and top should be O(1) by AVERAGE.
//The queue should support push(element), pop() and top() where pop is pop the first(a.k.a front) element in
//the queue.
//Both pop and top methods should return the value of first element.
import java.util.*;

public class HW2n3Q3 {
    static class Queue
    {
        static Stack<Integer> box = new Stack<Integer>();
        static Stack<Integer> newBox = new Stack<Integer>();

        static void enQueue(int x)
        {
            // Transfer elements from box to newBox
            while (!box.isEmpty())
            {
                newBox.push(box.pop());
            }
            box.push(x);


            while (!newBox.isEmpty())
            {
                box.push(newBox.pop());
            }
        }

        // Dequeue or removes an item from the queue
        static int deQueue()
        {
            if (box.isEmpty())
            {
                System.out.println("Queue is Empty");
                System.exit(0);
            }

            int x = box.peek();
            box.pop();
            return x;
        }
    };

    // main method
    public static void main(String[] args)
    {
        Queue q = new Queue();
        q.enQueue(10);
        q.enQueue(20);
        q.enQueue(30);

        System.out.println(q.deQueue());
        System.out.println(q.deQueue());
        System.out.println(q.deQueue());
    }
}

