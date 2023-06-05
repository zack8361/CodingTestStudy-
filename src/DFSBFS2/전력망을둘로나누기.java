package DFSBFS2;

import java.util.Arrays;

public class 전력망을둘로나누기 {
    private static boolean[] visited;
    private static int max = -1;
    private static int cnt = 0;
    public static void main(String[] args) {
        int n = 9;
        int[][] wires = {{1,3},{2,3},{3,4},{4,5},{4,6},{4,7},{7,8},{7,9}};
        System.out.println(solution(n,wires));
    }

    private static int solution(int n, int[][] wires) {
        int answer = 0;
        int[][] map = new int[n][n];

        for (int i = 0; i < wires.length; i++) {
            map[wires[i][0]-1][wires[i][1]-1] = 1;
            map[wires[i][1]-1][wires[i][0]-1] = 1;
        }

        visited = new boolean[map.length];

        for (int i = 0; i < map.length; i++) {
            System.out.println(Arrays.toString(map[i]));
        }

        for (int i = 0; i < map.length; i++) {
            dfs(i,map);
            visited[i] = false;
        }
        System.out.println(Arrays.toString(visited));


        return max;
    }

    private static void dfs(int now, int[][] map) {


    }
}
