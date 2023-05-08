package SWEAD3;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class 문제해결7일차암호생성기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int t=1; t<=N; t++){
            int[] arr = new int[8];
            for(int i=0; i<arr.length; i++){
                arr[i] = sc.nextInt();
            }
            ArrayDeque<Integer> deque = new ArrayDeque<>();
            for(int i=0; i<arr.length; i++){
                deque.addLast(arr[i]);
            }
            while (true) {
                boolean flag = false;
                for (int i = 0; i < 5; i++) {
                    if(deque.getLast() <= 0){
                        flag = true;
                        break;
                    }
                    System.out.println(i+1+"감소"+ "deque = " + deque);
                    deque.addLast(deque.pollFirst() - i - 1);
                }
                if(flag){
                    break;
                }
            }
            deque.pollLast();
            deque.addLast((Integer) 0);
            String answer = "";
            for(int i :deque){
                answer+=i +" ";
            }
            System.out.println("#" + t + " " +answer);
        }
    }
}
