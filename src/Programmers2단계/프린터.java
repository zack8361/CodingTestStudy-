package Programmers2단계;

import java.util.*;

public class 프린터 {
    public static void main(String[] args) {
        int[] priorities = {1,1,9,1,1,1};
        int location = 0;
        System.out.println(solution(priorities,location));
    }
//      Integer[] arr = Arrays.stream(priorities).boxed().toArray(Integer[]::new);
//      Arrays.sort(arr, Collections.reverseOrder());
    private static int solution(int[] priorities, int location) {
        int answer = priorities[location];
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        for(int i=0; i<priorities.length; i++){
            
        }
        return 0;
    }
}
