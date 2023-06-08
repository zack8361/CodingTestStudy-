package DFSBFS2;

import java.util.Arrays;
import java.util.Scanner;

public class 바이러스 {
    private static boolean[] visited;
    private static int cnt;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] map = new int[N][N];
        int M = sc.nextInt();

        visited = new boolean[N];

        for (int i = 0; i < M; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            map[A-1][B-1] = 1;
            map[B-1][A-1] = 1;
        }
        dfs(0,map);

        for (int i = 0; i < map.length; i++) {
            System.out.println(Arrays.toString(map[i]));
        }
        System.out.println("cnt = " + cnt);
    }

    private static void dfs(int now , int[][]map) {
        cnt++;
        visited[now] = true;

        for (int i = 0; i < map.length; i++) {
            if(!visited[i] && map[now][i] == 1){
                dfs(i,map);
            }
        }

    }
}
