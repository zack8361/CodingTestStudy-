package 백준실버1;

import java.util.Arrays;
import java.util.Scanner;

public class RGB거리 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[100];
        for (int i = 0; i < N; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            for (int j = A; j <= B; j++) {
                arr[j] = 1;
            }
        }



    }
}
