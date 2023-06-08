package DFSBFS;

import java.util.Arrays;

public class 네트워크DFS {
    private static int[][] computer;
    private static boolean[] visited;
    public static void main(String[] args) {
        int n = 3;
        int[][] computers = {{1,1,0},{1,1,0},{0,0,1}};
        System.out.println(solution(n,computers));
    }

    // 1번 -> 2번 연결 되어있음 //2번 -> 1번 연결 되어있음 // 3번 아무것도 연결안되어있다 . 1 - 2  / 3 와 같이 네트워크가 두개나온다.
     private static int solution(int n, int[][] computers) {
        computer = computers;
        visited = new boolean[n];
        int answer = 0;
        for(int i=0; i<n; i++){
            if(!visited[i]){
                dfs(i);
                answer++;
            }
        }
        return answer;
    }

    private static void dfs(int now){

        System.out.println("Arrays.toString(visited) = " + Arrays.toString(visited));
        if(visited[now]){
            return;
        }
        visited[now] = true;
        for(int i=0; i<computer.length; i++){
            if(computer[now][i] == 1 && !visited[i]){
                dfs(i);
            }
        }
    }
}
