package 주차3;

import java.util.Stack;

public class StackEx01 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("stack = " + stack);
        stack.pop();
        System.out.println("stack = " + stack);
        stack.pop();
        System.out.println("stack = " + stack);
        stack.pop();
        System.out.println("stack = " + stack);
    }
}
