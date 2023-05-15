package DFSBFS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class 최장경로DFS {

    private static int[][] map;
    private static boolean[] visited;
    private static int n;
    private static int max;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for(int t = 1; t<=tc; t++){
            int M = sc.nextInt();
            int N = sc.nextInt();
            n = M;

            map = new int[M][M];
            visited = new boolean[M];
            max = 0;

            for(int i=0; i<N; i++){
                int S = sc.nextInt();
                int E  = sc.nextInt();
                map[S-1][E-1] = map[E-1][S-1] = 1;
            }
            for(int i=0; i<n; i++){
                dfs(1,i);
                visited[i] = false;
            }
            System.out.println(max);
            for (int i = 0; i < map.length; i++) {
                System.out.println(Arrays.toString(map[i]));
            }
        }
    }

    private static void dfs(int cnt, int now) {

        visited[now] = true;

        for (int i = 0; i < n; i++) {
            if(map[now][i] == 1 && !visited[i]){
                dfs(cnt+1,i);
                visited[i] = false;
            }
        }
        max = Math.max(max,cnt);
    }
}
