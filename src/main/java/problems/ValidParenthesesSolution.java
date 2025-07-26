package problems;

import java.util.Stack;

public class ValidParenthesesSolution {
    public boolean isValid(String s) {
        if (s == null || s.isEmpty()) return true;
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (!stack.isEmpty() && (
                    (stack.peek() == '(' && c == ')') || (stack.peek() == '{' && c == '}') || (stack.peek() == '[' && c == ']')
            )){
                stack.pop();
            } else {
                return false;
            }
        }
        return stack.isEmpty();
    }
}
