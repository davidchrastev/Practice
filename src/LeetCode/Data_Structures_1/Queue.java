package LeetCode.Data_Structures_1;

import java.util.Stack;

public class Queue {

    private Stack<Integer> enqueueStack;
    private Stack<Integer> dequeueStack;

    public Queue() {
        enqueueStack = new Stack<>();
        dequeueStack = new Stack<>();
    }

    public void push(int x) {
        enqueueStack.push(x);
    }

    public int pop() {
        if (dequeueStack.isEmpty()) {
            while (!enqueueStack.isEmpty()) {
                dequeueStack.push(enqueueStack.pop());
            }
        }
        return dequeueStack.pop();
    }

    public int peek() {
        if (dequeueStack.isEmpty()) {
            while (!enqueueStack.isEmpty()) {
                dequeueStack.push(enqueueStack.pop());
            }
        }
        return dequeueStack.peek();
    }

    public boolean empty() {
        return enqueueStack.isEmpty() && dequeueStack.isEmpty();
    }
}
