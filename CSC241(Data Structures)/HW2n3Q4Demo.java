package HWs;

public class HW2n3Q4Demo {

    public static void main(String[] args){
        HW2n3Q4 q = new  HW2n3Q4(4);
        // checks if queue is empty and prints it out
        q.empty();
        q.printQueue();
        // starts adding elements to the queue &
        // checks if the queue is full after each element is added
        q.Enqueue(2);
        q.empty();
        q.Enqueue(3);
        q.empty();
        q.Enqueue(4);
        q.empty();
        q.Enqueue(5);
        q.empty();

        // following methods print out the current queue,
        // shows what element will be removed when Dequeue is called
        // and reprints queue
        q.printQueue();
        q.peek();
        q.Dequeue();
        q.printQueue();
        q.peek();
        q.Dequeue();
        q.printQueue();




    }
}
