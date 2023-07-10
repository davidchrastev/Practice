package CodeWars;

import java.util.Stack;

public class ValidParentheses {

    public static boolean validParentheses(String parens) {
        Stack<Character> stack = new Stack<>();

        for (char symbol : parens.toCharArray()) {
            if (symbol == '(') {
                stack.push(symbol);
            } else if (symbol == ')') {
                if (stack.isEmpty() || stack.pop() != '(') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
