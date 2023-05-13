package 고득점kit스택큐;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0; i<N; i++){
            arr[i] = sc.nextInt();
        }

            System.out.println(Arrays.toString(arr));
    }
}
