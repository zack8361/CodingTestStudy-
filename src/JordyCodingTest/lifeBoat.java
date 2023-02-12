package JordyCodingTest;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Stack;

public class lifeBoat {
    public static void main(String[] args) {
        int[] people = {70, 80, 50,50};
        int limit = 100;
        System.out.println(solution(people,limit));
    }

    private static int solution(int[] people, int limit) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        Arrays.sort(people);
        for(int i=0; i<people.length; i++){
            deque.addLast(people[i]);
        }
        int count = 0;
        while (!deque.isEmpty()){

            if(deque.peekFirst() + deque.peekLast()>limit){
                count++;
                deque.pollLast();
            }
            else {
                deque.pollFirst();
                deque.pollLast();
                count++;
            }
        }
        return count;
    }
}
