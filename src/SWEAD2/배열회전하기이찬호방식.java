package SWEAD2;

import java.util.ArrayDeque;
import java.util.Scanner;

public class 배열회전하기이찬호방식 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int t=1; t<=N; t++){
            int A = sc.nextInt();
            int[][] arr = new int[A][A];

            // 배열 입력하기
            for(int i=0; i<arr.length; i++){
                for (int j = 0; j < arr.length; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            // queue 사용
            for(int i=0; i<arr.length; i++){
                ArrayDeque<Integer> deque = new ArrayDeque<>();
                for(int j=0; j<arr.length; j++){
                    deque.addFirst(arr[j][i]);
                }

                System.out.print(" ");
                for(int j=0; j<arr.length; j++){
                    deque.addFirst(arr[j][i]);
                }

                System.out.print(" ");
                for(int j=0; j<arr.length; j++){
                   deque.addFirst(arr[j][i]);
                }
                System.out.print(deque);
                System.out.println();
            }
        }
    }
}
