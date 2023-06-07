package newProgrammers2단계;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashSet;

public class 영어끝말잇기 {
    public static void main(String[] args) {
        int n = 3;
        String[] words = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
        System.out.println(solution(n,words));
    }

    private static int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        ArrayDeque<String> deque = new ArrayDeque<>();
        for (int i = 0; i < words.length; i++) {
            if(deque.isEmpty()){
                deque.addLast(words[i]);
            }
            else {
                if(deque.peekLast().charAt(deque.peekLast().length()-1) != words[i].charAt(0) || deque.contains(words[i])){
                    System.out.println(i%n + 1);
                    System.out.println(i/n + 1);
                    break;
                }
            }

            deque.addLast(words[i]);
        }

        System.out.println("deque = " + deque);
        return answer;
    }
}
