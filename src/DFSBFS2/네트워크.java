package DFSBFS2;

import java.util.Arrays;

public class 네트워크 {

    private static int cnt;
    private static boolean[] visited;
    private static int[][] com;
    public static void main(String[] args) {
        int n = 3;
        int[][] computers = {{1,1,0},{1,1,0},{0,0,1}};
        System.out.println(solution(n,computers));
    }

    private static int solution(int n, int[][] computers) {
        visited = new boolean[computers.length];
        com = computers;

        for (int i = 0; i < computers.length; i++) {
            if(!visited[i]){
                dfs(i);
                cnt++;
            }
        }

        System.out.println(Arrays.toString(visited));
        return cnt;
    }

    private static void dfs(int now) {

        if(visited[now]){
            return;
        }
        visited[now] = true;
        for (int i = 0; i < com.length; i++) {
            if(com[now][i] == 1){
                dfs(i);
            }
        }
    }
}
