package LeetCode.LinkedList;

import java.util.ArrayDeque;
import java.util.Deque;

public class Browser {
    private Deque<String> history;
    private Deque<String> forward;

    public Browser(String homepage) {
        history = new ArrayDeque<>();
        forward = new ArrayDeque<>();
        history.push(homepage);
    }

    public void visit(String url) {
        history.push(url);
        forward.clear();
    }

    public String back(int steps) {
        while (steps-- > 0 && history.size() > 1) {
            forward.push(history.pop());
        }
        return history.peek();
    }

    public String forward(int steps) {
        while (steps-- > 0 && !forward.isEmpty()) {
            history.push(forward.pop());
        }
        return history.peek();
    }
}
