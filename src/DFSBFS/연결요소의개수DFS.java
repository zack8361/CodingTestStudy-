package DFSBFS;

import java.util.Arrays;
import java.util.Scanner;

public class 연결요소의개수DFS {

    private static boolean[] visited;
    private static int count = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 정점의 개수
        int M = sc.nextInt(); // 간선의 개수.
        int[][] net = new int[N][N];
        visited = new boolean[N];
        // 네트워크 망 처럼 입력받는다.
        for(int i=0; i<M; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            net[x - 1][y - 1] = 1;
            net[y - 1][x - 1] = 1;
        }
        for(int i =0; i<net.length; i++){
            if(!visited[i]){
                dfs(i,net);
                count++;
            }
        }
        System.out.println(count);
    }

    private static void dfs(int start, int[][] net) {
        if(visited[start]){
            return;
        }
        visited[start] = true;
        for(int i=0; i<net.length; i++){
            if(net[start][i] == 1){
                dfs(i,net);
            }
        }
    }
}
