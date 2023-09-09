package 고득점kitDFS;

import java.util.Arrays;

public class 네트워크 {

    private static int[][] computer;
    private static boolean[] visited;
    private static int cnt;
    public static void main(String[] args) {
        int n = 3;
        int[][]computers = {{1,1,0},{1,1,0},{0,0,1}};
        System.out.println(solution(n,computers));
    }

    private static int solution(int n, int[][] computers) {
        computer = computers;
        visited = new boolean[computers.length];


        for (int i = 0; i < computers.length; i++) {
            if(!visited[i]){
                dfs(i);
                cnt++;
            }
        }
        return cnt;
    }

    private static void dfs(int now) {
        visited[now] = true;

        for (int i = 0; i < computer.length; i++) {
            if(!visited[i] && computer[now][i] == 1){
                dfs(i);
            }
        }
    }
}
