package 우선순위큐;

import java.util.PriorityQueue;

public class 프로세스 {
    public static void main(String[] args) {
        int[] priorities = {1,1,9,1,1,1};
        int location = 0;
        System.out.println(solution(priorities,location));
    }

    private static int solution(int[] priorities, int location) {
        int answer = priorities[location];
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (Integer i  : priorities) {
            pq.add(i);
        }
        System.out.println(pq);
        int count = 0;
        for(int i=0; i<priorities.length; i++){
            if(pq.poll() == answer){
                count++;
            }
        }

        return count;

    }
}
