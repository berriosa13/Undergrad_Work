package HWs;

import ClassCode.LinkedList;
import ClassCode.Node;


public class HW1Q2 {
    public static void main(String[] args) {

        ClassCode.LinkedList l1 = new LinkedList();
        l1.head = new Node(1);
        l1.head.next = null;

        insertith(l1, 5, 2);
        System.out.print(l1);
    }

    public static void insertith(ClassCode.LinkedList l1, int data, int i) {
        Node dummy = new Node(1);
        dummy.next = l1.head;
        Node runner = dummy;
        for(int j = 0; j < i; ++i) {
            runner = runner.next;
        }

        Node node = new Node(1);
        node.data = data;
        node.next = runner.next;
        runner.next = node;

        // Precondition: head is the head reference of a linked list.
        // The list may be empty or non empty.
        //
        // Pre condition: the number value is inserted as the ith member
        // of the list head. If the list head has fewer than i-1 nodes in it,
        // then value is inserted as the last node in the list.
    }

}
