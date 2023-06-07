package 백준실버1;

import java.util.Arrays;
import java.util.Scanner;

public class RGB거리 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[1000000];
        int realCnt = 0;
        for (int i = 0; i < N; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int count = 0;

            for (int j = A; j <= B; j++) {
                if(arr[j] == 0){
                    count ++;
                }
            }
            if(count == B-A + 1){
                for (int j = A; j <= B; j++) {
                    arr[j] = 1;
                }
                realCnt++;
            }
        }

        System.out.println(realCnt);
    }
}
