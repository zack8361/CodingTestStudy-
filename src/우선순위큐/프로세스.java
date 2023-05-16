package 우선순위큐;

import java.util.Arrays;
import java.util.PriorityQueue;

public class 프로세스 {
    public static void main(String[] args) {
        int[] priorities = {1,1,9,1,1,1};
        int location = 0;
        System.out.println(solution(priorities,location));
    }
    private static class que {
        int idx, value;

        public que(int idx, int value) {
            this.idx = idx;
            this.value = value;
        }

    }

    private static int solution(int[] priorities, int location){
        int result = priorities[location];
        PriorityQueue<que> pq = new PriorityQueue<>((o1,o2) ->Integer.compare(o2.value,o1.value));
        for(int i=0; i<priorities.length; i++){
            pq.add(new que(i,priorities[i]));
        }

        int count = 0;
        while (!pq.isEmpty()){
            if (pq.poll().idx == result){
                break;
            }
            count++;
        }
        System.out.println("count = " + count);
        return count;
    }
}
