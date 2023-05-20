package DFSBFS;

import java.util.Scanner;

public class DFS기본 {
    private static boolean[] visited;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int Z = sc.nextInt();
        int[][] net = new int[N][N];
        visited = new boolean[N];
        for(int i=0; i<M; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            net[x-1][y-1] = 1;
            net[y-1][x-1] = 1;
        }
        dfs(Z-1,net);
    }

    private static void dfs(int now,int[][] net) {
        visited[now] = true;
        System.out.println(now+1);
        for(int i=0; i<net.length; i++){
            if(!visited[i] && net[now][i] == 1){
                dfs(i,net);
            }
        }
    }
}
