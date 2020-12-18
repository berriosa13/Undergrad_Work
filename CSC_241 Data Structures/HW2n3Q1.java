package HWs;

// This program will implement a max() function
// that should return the largest number in the stack
// push, pop, and max operations are all included

import java.util.Stack;

public class HW2n3Q1 {
    Stack<Integer> stack = new Stack<>();
    int maxElement;

    public static void main(String[] args) {
        HW2n3Q1 stack1 = new HW2n3Q1();
        stack1.push(2);
        stack1.push(6);
        stack1.Max();
        stack1.push(4);
        stack1.push(13);
        stack1.Max();
        stack1.pop();
        stack1.push(8);
        stack1.Max();
        stack1.pop();
        stack1.peek();
    }
    void Max()
    {
        if (stack.empty())
            System.out.print("Stack is empty\n");
            // maxElement stores maximum element in the stack
        else
            System.out.print("Maximum element: "
                    + maxElement + "\n");
    }
    // Shows top element of stack without removing it
    void peek()
    {
        if (stack.empty())
        {
            System.out.print("Stack is empty ");
            return;
        }

        int top = stack.peek();
        System.out.print("Top element: ");

        // maxElement stores the value of top if top is less than maxElement
        if(top > maxElement)
            System.out.print(maxElement);
        else
            System.out.print(top);
    }

    // Removes top element from the stack
    void pop()
    {
        if (stack.empty()) {
            System.out.print("Stack is empty\n");
            return;
        }

        System.out.print("Top element removed: ");
        int top = stack.peek();
        stack.pop();

        if(top > maxElement) {
            System.out.print(maxElement + "\n");
            maxElement = 2*maxElement-top;
        }
        else {
            System.out.print(top +"\n");
        }
    }

    void push(int x) {
        // Inserts # into stack
        if (stack.empty()) {
            maxElement = x;
            stack.push(x);
            System.out.print("Number Inserted: " + x + "\n");
            return;
        }
        if(x > maxElement) {
            stack.push(2 * x - maxElement);
            maxElement = x;
        }
        else {
            stack.push(x);
        }
        System.out.print("Number Inserted: " + x + "\n");



    }

}


