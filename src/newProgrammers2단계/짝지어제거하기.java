package newProgrammers2단계;

import java.util.ArrayDeque;

public class 짝지어제거하기 {
    public static void main(String[] args) {
        String s = "baabaa";
        System.out.println(solution(s));
    }

    private static int solution(String s) {
        ArrayDeque<Character> deque = new ArrayDeque<>();

        for (int i = 0; i < s.length(); i++) {
            if(deque.isEmpty()){
                deque.addLast(s.charAt(i));
            }
            else {
                if(deque.peekLast() == s.charAt(i)){
                    deque.pollLast();
                }
                else {
                    deque.addLast(s.charAt(i));
                }
            }
        }
        if(deque.isEmpty()){
            return 1;
        }

        return 0;
    }
}
