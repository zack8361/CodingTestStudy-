package 주차1;

import java.util.Arrays;
import java.util.Scanner;

public class 구간합구하기4PrefixSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M =sc.nextInt();

        // 배열 입력 공간
        int[] arr = new int[N+1];

        arr[1] = sc.nextInt();

        // 직전에 입력값 + 현재 입력값 으로 받아 누적합으로 입력한다.
        for(int i=2; i<arr.length; i++){
            arr[i] = arr[i-1] + sc.nextInt();
        }

        // 구간 입력 받기.
        for(int i=0; i<M; i++){
            int start = sc.nextInt();
            int end = sc.nextInt();
            System.out.println(arr[end] - arr[start-1]);
        }
    }
}
