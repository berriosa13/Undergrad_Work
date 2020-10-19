package Quiz1;


import java.util.HashMap;
import java.util.Stack;

/*
Given a string containing just the characters (;);f;g;[;],
determine if the input string isvalid.
An input string is valid if: Open brackets
 must be closed by the same type of brackets
 */
public class validParentheses {
    private HashMap<Character, Character> mappings;

    public validParentheses() {
        this.mappings = new HashMap<Character, Character>();
        this.mappings.put(')', '(');
        this.mappings.put('}', '{');
        this.mappings.put(']', '[');
    }

    public boolean isValidParentheses(String s) {

        Stack<Character> stack = new Stack<Character>();      // Initializes stack

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

           // Uses contains() to check for open bracket
            if (this.mappings.containsKey(c)) {

                // Get the top element of the stack.
                // If the stack is empty, set a dummy value of '#'
                char topElement = stack.empty() ? '#' : stack.pop();

                // Returns false if mapping and top element !=
                if (topElement != this.mappings.get(c)) {
                    return false;
                }
            }
            else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}

