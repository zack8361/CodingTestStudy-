package SWEAD3;

import java.util.Arrays;
import java.util.Scanner;

public class 부분수열의합 {
    private static int answer = 0;
    private static int K;
    private static boolean[] visited;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for(int t=1; t<=tc; t++){
            int N = sc.nextInt(); //배열 크기 입력
            K = sc.nextInt(); // target 입력.
            int[]arr = new int[N];
            int[]output = new int[N];
            visited = new boolean[N];
            // 배열 값 입력.
            for(int i=0; i<arr.length; i++){
                arr[i] = sc.nextInt();
            }

            for(int i=0; i<arr.length; i++){
                dfs(arr,output,0,i+1);
            }
            System.out.println(answer);
        }
    }
    
    }
}
