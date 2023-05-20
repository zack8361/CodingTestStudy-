package 백준실버2;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class DFS와BFS {
    private static boolean[] visited;
    private static boolean[] visited2;
    private static int answer = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        answer = N;
        int start = sc.nextInt();
        int[][] arr = new int[N][N];
        visited = new boolean[N];
        visited2 = new boolean[N];
        for(int i=0; i<M; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            arr[a-1][b-1] = 1;
            arr[b-1][a-1] = 1;
        }
        dfs(start-1,0,arr);
        System.out.println();
        bfs(start-1,arr);
    }

    private static void bfs(int start, int[][] arr) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        deque.addLast(start);
        visited2[start] = true;
        while (!deque.isEmpty()) {
            start = deque.pollFirst();
            System.out.print(start+1 + " ");
            for (int i = 0; i < answer; i++) {
                if (!visited2[i] && arr[start][i] == 1) {
                    deque.add(i);
                    visited2[i] = true;
                }
            }
        }
    }

    private static void dfs(int start, int depth,int[][] arr) {

        visited[start] = true;
        System.out.print(start+1 +" ");
        for(int i=0; i<answer; i++){
            if(!visited[i] && arr[start][i] == 1){
                visited[i] = true;
                dfs(i,depth,arr);
            }
        }
    }

}
