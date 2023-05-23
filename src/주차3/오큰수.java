package 주차3;

import java.util.*;

public class 오큰수 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        ArrayDeque<Integer> deque1 = new ArrayDeque<>();
        for(int i=0; i<N; i++){
            arr[i] = sc.nextInt();
        }

        for(int i= arr.length-1; i>=0; i--){
            while (!deque.isEmpty() && deque.peekLast()<=arr[i]){
                deque.pollLast();
            }
            if(deque.isEmpty()){
                deque1.addFirst(-1);
            }
            else {
                deque1.addFirst(deque.peekLast());
            }
            deque.addLast(arr[i]);
        }
        System.out.println(deque1);
    }
}
