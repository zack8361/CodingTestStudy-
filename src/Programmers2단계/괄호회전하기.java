package Programmers2단계;

import java.util.ArrayDeque;

public class 괄호회전하기 {
    public static void main(String[] args) {
        String s = "[](){}";
        System.out.println(solution(s));
    }

    private static int solution(String s) {
        int result = 0;
        String[] str = s.split("");
        ArrayDeque<String> deque = new ArrayDeque<>();
        for(int i=0; i<str.length; i++){
            deque.addLast(str[i]);
        }

        for(int i=0; i<str.length; i++){
            String answer ="";
            deque.addLast(deque.pollFirst());
            for(String j:deque){
                answer+=j;
            }
            ArrayDeque<Character> deque1 = new ArrayDeque<>();
            for(int j=0; j<answer.length(); j++){
                if(deque1.isEmpty()){
                    deque1.addLast(answer.charAt(j));
                }
                else {
                    if(deque1.peekLast() == '(' && answer.charAt(j) == ')'){
                        deque1.pollLast();
                    }
                    else if(deque1.peekLast() == '{' && answer.charAt(j) == '}'){
                        deque1.pollLast();
                    }
                    else if(deque1.peekLast() == '[' && answer.charAt(j) == ']'){
                        deque1.pollLast();
                    }
                    else {
                        deque1.addLast(answer.charAt(j));
                    }
                }
            }
            if(deque1.isEmpty()){
                result++;
            }
        }
        return result;
    }
}
