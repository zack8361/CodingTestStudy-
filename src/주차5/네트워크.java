package 주차5;

import javax.swing.plaf.IconUIResource;
import java.util.ArrayList;
import java.util.Arrays;

public class 네트워크 {
    private static boolean[] visited;
    private static int[][] com;
    private static int ans = 0;
    private static  ArrayList<Integer> list;

    public static void main(String[] args) {
        int n = 3;
        int[][] computers = {{1, 1, 0}, {1, 1, 0}, {0, 0, 1}};
        System.out.println(solution(n, computers));
    }

    private static int solution(int n, int[][] computers) {

        int depth = 0;
        com = computers;
        list = new ArrayList<>();
        visited = new boolean[n];

        for(int i=0; i<computers.length; i++){
            if(!visited[i]){
                dfs(i);
                depth++;
            }
        }
        System.out.println(depth);
        System.out.println(Arrays.toString(visited));
        return depth + 100;
    }

    private static void dfs(int now) {

        if (visited[now]){
            return;
        }

        visited[now] = true;
        for(int i=0; i< com.length; i++){
            if(com[now][i] == 1){
                dfs(i);
            }
        }
    }
}
