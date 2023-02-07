package JordyCodingTest;


import java.util.ArrayDeque;

/**
 * Stack = LIFO -> Last In First Out
 * Stack/Queue -> 올바른괄호(Programmers.Lv2)
 */

public class StackEx01 {
    public static void main(String[] args) {
        String s = "()()";
        System.out.println(solution(s));
    }

    private static boolean solution(String s) {

        ArrayDeque<Character> deque = new ArrayDeque<>();
        for(int i=0; i<s.length(); i++){
            if (deque.isEmpty()) {
                if(s.charAt(i) == ')'){
                    return false;
                }
                else {
                    deque.addLast(s.charAt(i));
                }
            }
            else {
                if(deque.peekLast() != s.charAt(i)){
                    deque.pollLast();
                }
                else {

                    deque.addLast(s.charAt(i));
                }
            }
        }
        if(deque.isEmpty()){
            return true;
        }
        return false;
    }
}

