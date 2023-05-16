package 우선순위큐;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.PriorityQueue;

public class 징검다리건너기 {
    public static void main(String[] args) {
        int[] stones = {2,4,5,3,2,1,4,2,5,1};
        int k = 3;
        System.out.println(solution(stones,k));
    }

    private static int solution(int[] stones, int k) {
        int answer = 0;
        int min = 200000001;
        for(int i=0; i<stones.length-k+1; i++){
            PriorityQueue<Integer> pq = new PriorityQueue<>();
            int a = 0;
            int max = 0;
            for(int j=0; j<k; j++){
                pq.add(stones[i+j]);
                max =  Math.max(max,stones[i+j]);
            }
            min = Math.min(min,max);
        }
        return min;
    }
}
