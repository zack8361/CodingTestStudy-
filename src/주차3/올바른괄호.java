package 주차3;

import java.util.ArrayDeque;


public class 올바른괄호 {
    public static void main(String[] args) {
        String s = "()()";
        System.out.println(solution(s));
    }

    private static boolean solution(String s) {
        ArrayDeque<Character> stack = new ArrayDeque<>();
        for(int i=0; i<s.length(); i++){
            if(stack.isEmpty()){
                stack.addLast(s.charAt(i));
            }
            else {
                if(stack.peek() == '('  && stack.peek()!= s.charAt(i)){
                    stack.pollLast();
                }
                else {
                    stack.addLast(s.charAt(i));
                }
            }
        }
        return stack.isEmpty();
    }
}
