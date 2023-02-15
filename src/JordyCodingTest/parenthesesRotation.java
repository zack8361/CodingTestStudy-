package JordyCodingTest;

import java.util.ArrayDeque;

public class parenthesesRotation {
    public static void main(String[] args) {
        String s = "[](){}";
        System.out.println(solution(s));
    }

    private static int solution(String s) {
        int answer = 0;

        for (int j = 0; j < s.length(); j++) {
            ArrayDeque<Character> stack = new ArrayDeque<>();
            if (j > 0) {
                stack.addLast(stack.peekFirst());
            }
            for (int i = 0; i < s.length(); i++) {
                if (stack.isEmpty()) {
                    stack.push(s.charAt(i));
                } else {
                    if (stack.peekLast() == '[' && s.charAt(i) == ']') {
                        stack.pollLast();
                    } else if (stack.peekLast() == '{' && s.charAt(i) == '}') {
                        stack.pollLast();
                    } else if (stack.peekLast() == '(' && s.charAt(i) == ')') {
                        stack.pollLast();
                    } else {
                        stack.addLast(s.charAt(i));
                    }
                }
            }
            if (stack.isEmpty()) {
                answer++;
            }
        }
             return answer;
    }
}
