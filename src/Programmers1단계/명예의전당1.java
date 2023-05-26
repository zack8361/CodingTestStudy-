package Programmers1단계;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class 명예의전당1 {
    public static void main(String[] args) {
        int k = 3;
        int[] score = {10,100,20,150,1,100,200};
        System.out.println(solution(k,score));
    }

    private static int[] solution(int k, int[] score) {

        int[] answer = new int[score.length];
        ArrayList<Integer> list = new ArrayList<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i=0; i<score.length; i++){
            if(pq.size()<k){
                pq.add(score[i]);
                list.add(pq.peek());
            }

            if(i>=k){
                if(pq.peek()<score[i]){ // 현재 peek 보다 score[i] 가 클떄.
                    pq.poll();
                    pq.add(score[i]);
                    list.add(pq.peek());
                }
                else { // 작을때.
                    list.add(pq.peek());
                }
            }

        }
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}
