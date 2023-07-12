package L4;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main3 {
    public static void main(String[] args) {
        testQueue();
    }
    static void testQueue(){
        Queue<String> queue = new LinkedList<>();
        queue.add("1");
        queue.add("2");
        queue.add("3");
        queue.add("4");
        System.out.println(queue);
    }

    static void testStack(){
        Stack<String> stack = new Stack<>();
        stack.push("1");
        stack.push("2");
        stack.push("3");
        stack.push("4");

        for (String string : stack) {
            System.out.println(string);
        }
    }
}
