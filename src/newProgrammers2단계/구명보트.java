package newProgrammers2단계;

import java.util.ArrayDeque;
import java.util.Arrays;

public class 구명보트 {
    public static void main(String[] args) {
        int[] people = {70,50,80,50};
        int limit = 100;
        System.out.println(solution(people,limit));
    }

    private static int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        for (int i = 0; i < people.length; i++) {
            deque.addLast(people[i]);
        }

        while (!deque.isEmpty()){
            if(deque.peekFirst() + deque.peekLast() > limit){
                deque.pollLast();
                answer++;
            }
            else {
                deque.pollLast();
                deque.pollFirst();
                answer++;
            }
        }

        return answer;
    }
}
