package 주차5;

import java.util.Arrays;

public class 부대복귀1 {
    private static int answer;
    private static boolean[] visited;
    private static int[][] map;
    public static void main(String[] args) {
        int n = 3;
        int[][] roads = {{1,2},{2,3}};
        int[] sources = {2,3};
        int destination = 1;
        System.out.println(solution(n,roads,sources,destination));
    }

    private static int[] solution(int n, int[][] roads, int[] sources, int destination) {
        answer = destination;
        visited = new boolean[n];
        map = new int[n][n];


        for (int i = 0; i < roads.length; i++) {
            map[roads[i][0] - 1][roads[i][1] - 1] = 1;
            map[roads[i][1] - 1][roads[i][0] - 1] = 1;
        }
        for (int i = 0; i < sources.length; i++) {
            dfs(sources[i]-1,1);
            visited[sources[i]-1] = false;
        }
        for (int i = 0; i < map.length; i++) {
            System.out.println(Arrays.toString(map[i]));
        }
        System.out.println(Arrays.toString(visited));
        return new int[0];
    }

    private static void dfs(int now,int depth) {


        visited[now] = true;
        for(int i=0; i<map.length; i++){
            if(!visited[i] && map[now][i] == 1){
                dfs(i,depth+1);
                visited[i] = false;
            }
        }
    }

}
