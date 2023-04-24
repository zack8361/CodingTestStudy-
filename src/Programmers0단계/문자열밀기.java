package Programmers0단계;

import java.util.ArrayDeque;
import java.util.Iterator;

public class 문자열밀기 {
    public static void main(String[] args) {
        String A = "abcdefg";
        String B = "ohell";
        System.out.println(solution(A,B));
    }

    private static int solution(String A, String B) {
        int answer = 0;
        ArrayDeque<Character> deque = new ArrayDeque<>();
        String str = "";
        for(int i=0; i<A.length(); i++){
            deque.addLast(A.charAt(i));
        }

        if(A.equals(B)){
            return 0;
        }
        for(int i=0; i<A.length(); i++){
            if(str.equals(B)){
                return answer;
            }
            deque.addFirst(deque.pollLast());
            for(Character j: deque){
                str+=j;
            }
            answer++;
        }

        return -1;
    }
}
