package DFSBFS;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;

public class 최장경로 {

    private static boolean[] visited;
    private static int[][] map;
    private static int max;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        for(int t=1; t<=tc; t++){
            int N = sc.nextInt();
            int M = sc.nextInt();
            max = Integer.MIN_VALUE;
            visited = new boolean[N];
            map = new int[N][N];
            for(int i=0; i<M; i++){
                int A = sc.nextInt();
                int B = sc.nextInt();
                map[A-1][B-1] = 1;
                map[B-1][A-1] = 1;
            }
            for(int i=0; i<N; i++){
                dfs(i,1);
                visited[i] = false;
            }
            System.out.println("#" + t +" " + max);
        }
    }

    private static void dfs(int now, int cnt) {
        visited[now] = true;
        for(int i=0; i<map.length; i++){
            if(map[now][i] == 1 && !visited[i]){
                dfs(i,cnt+1);
                visited[i] = false;
            }
        }
        max = Math.max(max,cnt);
    }
}
