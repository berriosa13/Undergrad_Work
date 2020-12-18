package HWs;

import ClassCode.LinkedList;
import ClassCode.Node;

public class HW1Q1 {
    public static void main(String[] args)
    {
        LinkedList l1 = new LinkedList();
        l1.head = new Node(2);
        l1.head.next = new Node(3);
        l1.head.next.next = new Node(1);

        LinkedList l2 = new LinkedList();
        l2.head = new Node(4);
        l2.head.next = new Node(5);

        concatenate(l1, l2);

    }

    public static void concatenate(LinkedList l1, LinkedList l2) {
        Node n;
        Node curr = l2.head;
        while(curr != null) {
            n = curr;
            curr = curr.next;
            l1.addToEnd(n);
            System.out.print(l1);
        }

    }

}
