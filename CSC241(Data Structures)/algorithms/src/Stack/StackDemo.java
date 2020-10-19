package Stack;


public class StackDemo{

    public static void main(String[] args)
    {
        LinkedListStack a = new LinkedListStack();
        ArrayStack b = new ArrayStack(5);
        System.out.println(a.isEmpty());
        a.push(10);
        System.out.println(a.peek());
        int val = a.pop();
        System.out.println(val);



        System.out.println(b.isEmpty());
        b.push(10);
        System.out.println(b.peek());
        int val1 = a.pop();
        System.out.println(val1);


    }
}
