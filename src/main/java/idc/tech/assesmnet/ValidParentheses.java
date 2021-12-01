package idc.tech.assesmnet;

import java.util.HashMap;
import java.util.Stack;

public class ValidParentheses {

    private final HashMap<Character, Character> mapping = new HashMap<>();

    public ValidParentheses() {
        mapping.put('}', '{');
        mapping.put(')', '(');
        mapping.put(']', '[');
    }

    public boolean isValid(String input) {
        Stack<Character> stack = new Stack<>();
        for (Character item : input.toCharArray()) {
            if (mapping.containsKey(item)) {
                Character topElement = stack.isEmpty() ? '#' : stack.peek();
                Character openBraces = mapping.get(item);
                if (topElement.equals(openBraces)) {
                    stack.pop();
                }
            } else {
                stack.push(item);
            }
        }
        return stack.isEmpty();
    }
}
