package BackTracking;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class 제일작은수 {
    // queue -> 선입 선출 -> FIFO 의 자료구조 형태를 가지고있다.
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(1); // 얘가 먼저들어왔기 때문에 먼저나간다.
        queue.add(2);
        System.out.println("queue = " + queue);
        System.out.println("queue = " + queue.poll());
        System.out.println("queue = " + queue);
        stack();
    }

    private static void stack(){

        // Stack -> 후입 선출 -> LIFO 의 자료구조 형태를 가지고있다. 박스를 여러개 차곡차곡 쌓아두고 위에서 부터 스택대로 뽑는 느낌.

        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2); // 얘가 나중에 들어왔기 때문에 -> 먼저 나간다.
        System.out.println("stack = " + stack);
        System.out.println("stack = " + stack.pop());
    }
}
