package 우선순위큐;

import java.util.PriorityQueue;

public class 징검다리건너기정답 {
    public static void main(String[] args) {
        int[] stones = {2,4,5,3,2,1,4,2,5,1};
        int k = 3;
        System.out.println(solution(stones,k));
    }

    private static class Stone {
        int idx, val;

        public Stone(int idx, int val) {
            this.idx = idx;
            this.val = val;
        }
    }

    private static int solution(int[] stones, int k) {
        PriorityQueue<Stone> pq = new PriorityQueue<>((o1,o2) -> Integer.compare(o2.val,o1.val)); // value 기준 내림차순 정렬

        int i;
        for(i=0; i<k; i++){
            pq.add(new Stone(i,stones[i]));
        }
        int answer = pq.peek().val;

        while (i<stones.length){
            pq.add(new Stone(i,stones[i]));
            i++;

        }
        return answer;
    }
}
