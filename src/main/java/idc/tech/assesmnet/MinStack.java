package idc.tech.assesmnet;

import java.util.Stack;

public class MinStack implements IMinStack {
    private final Stack<Integer> stack = new Stack<>();
    private final Stack<Integer> minStack = new Stack<>();

    public void push(int item) {
        this.stack.push(item);
        if (this.minStack.isEmpty() || item <= this.minStack.peek()) {
            this.minStack.push(item);
        }
    }

    public void pop() {
        if (this.stack.peek().equals(this.minStack.peek())) {
            this.minStack.pop();
        }
        this.stack.pop();
    }

    public int top() {
        return this.stack.peek();
    }

    public int getMin() {
        return this.minStack.peek();
    }
}
