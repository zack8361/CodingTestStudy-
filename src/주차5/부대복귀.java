package 주차5;

import java.util.Arrays;

public class 부대복귀 {
    private static int[][] net;
    private static boolean[] visited;
    public static void main(String[] args) {
        int n = 3;
        int[][] roads = {{1,2},{1,4},{2,4},{2,5},{4,5}};
        int[] sources = {1,3,5};
        int destination = 5;
        System.out.println(solution(n,roads,sources,destination));
    }

    private static int[] solution(int n, int[][] roads, int[] sources, int destination) {

        net = new int[n][n];
        visited = new boolean[n];

        for(int i=0; i<roads.length; i++){
            net[roads[i][0]-1][roads[i][1]-1] = 1;
            net[roads[i][1]-1][roads[i][0]-1] = 1;
        }

        for(int i=0; i<sources.length; i++){
            dfs(sources[i]-1,0);
            visited[sources[i]-1] = false;
        }


        System.out.println(Arrays.toString(visited));
        return new int[90];
    }

    private static void dfs(int start, int depth) {
        visited[start] = true;
        for(int i=0; i<net.length; i++){
            if(!visited[i] && net[start][i] == 1){
                visited[i] = true;
                dfs(i, depth +1);
                visited[i] = false;
            }
        }
        System.out.println(depth);
    }
}
