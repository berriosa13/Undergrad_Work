package Quiz1;

import java.util.LinkedList;

public class compareLists {
    Node head;

     class Node {
         int data;
         Node next;
         // constructor to create a new node
         // Next is by default initialized as null
         Node(int d) {
             data = d;
         }
     }

        // following method only returns true if lists are identical
        // if not, returns false
        boolean isEqualRecur(Node h1, Node h2) {
        // If the lists are empty --> return true
        if(h1 == null && h2 == null) {
            return true;
        }
        
        if(h1 != null && h2 != null) {
            return (h1.data == h2.data) &&
                    isEqualRecur(h1.next, h2.next);
        }
            return false;

        }
        static void isEqual(LinkedList list1, LinkedList list) {

        }

        void push(int newData) {
            Node newNode = new Node(newData);
            newNode.next = head;
            head = newNode;
        }

    public static void main(String[] args) {
        LinkedList list1 = new LinkedList();
        LinkedList list2 = new LinkedList();

        list1.push(1);
        list1.push(2);
        list1.push(3);

        list2.push(1);
        list2.push(2);
        list2.push(3);


            System.out.println("The two lists are identical");

            System.out.println("The two lists are not identical");
    }
    }

