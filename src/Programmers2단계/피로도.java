package Programmers2단계;

import java.util.Arrays;

public class 피로도 {

    private static int max = -1;
    private static boolean[] visited;
    public static void main(String[] args) {
        int k = 80;
        int[][] dungeons = {{80,20},{50,40},{30,10}};
        System.out.println(solution(k,dungeons));
    }

    private static int solution(int k, int[][] dungeons) {

        visited = new boolean[dungeons.length];
        for(int i=0; i<dungeons.length; i++){
            dfs(i,1,k-dungeons[i][1],dungeons);
            visited[i] = false;
        }
        return max;
    }

    private static void dfs(int now, int depth, int sum, int[][] map) {
        max = Math.max(max,depth);
        System.out.println(sum);
        visited[now] = true;
        
        for (int i = 0; i < map.length; i++) {
            if(!visited[i] && map[i][0]<=sum){
                dfs(i,depth+1,sum-map[i][1],map);
                visited[i] = false;
            }
        }
    }
}
