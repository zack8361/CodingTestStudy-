package 주차3;

import java.util.ArrayDeque;
import java.util.Arrays;

public class 주식가격 {
    public static void main(String[] args) {
        int[] prices ={1,2,3,2,3};
        System.out.println(solution(prices));
    }

    private static int[] solution(int[] prices) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        int[] answer = new int[prices.length];


        for(int i=answer.length-1; i>= 0; i--){
            
        }
        System.out.println("deque = " + deque);

        System.out.println(Arrays.toString(answer));

        return new int[0];

    }
}
