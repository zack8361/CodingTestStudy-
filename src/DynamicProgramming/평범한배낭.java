package DynamicProgramming;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class 평범한배낭 {
    private static int[][] map;
    private static int cnt;
    private static boolean[] visited;
    private static int max = -1;
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();


        // 4,2 짜리 배열 만듬
        map = new int[N][2];
        visited = new boolean[N];

        for (int i = 0; i < N; i++) {
            int W = sc.nextInt();
            int V = sc.nextInt();
            map[i][0] = W;
            map[i][1] = V;
        }
        dfs(0,0,0,K,map);

        System.out.println(max);
    }

    private static void dfs(int now, int sum, int realSum, int k,int[][] map) {
        if(sum>k){
            return;
        }
        if(sum<=k){
            max = Math.max(max,realSum);
        }
        for (int i = now; i <map.length; i++) {
            dfs(i+1,sum + map[i][0] , realSum + map[i][1],k,map);
        }
    }
}
