package 주차5;

import java.util.ArrayDeque;
import java.util.Arrays;

public class 게임맵최단거리 {
    private static int[]dx = {0,0,1,-1};
    private static int[]dy = {1,-1,0,0};
    public static void main(String[] args) {
        int[][] maps = {{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,1},{0,0,0,0,1}};
        System.out.println(solution(maps));
    }

    private static class Node{
        int x;
        int y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    private static int solution(int[][] maps) {
        int N = maps.length;
        int M = maps[0].length;

        int[][] output = new int[N][M];
        boolean[][] visited = new boolean[N][M];
        ArrayDeque<Node> deque = new ArrayDeque<>();
        deque.addLast(new Node(0,0));
        output[0][0] = 1;
        visited[0][0] = true;
        while (!deque.isEmpty()){
            Node now = deque.pollFirst();
            for(int i=0; i<4; i++) {
                int nx = now.x + dx[i];
                int ny = now.y + dy[i];

                if (nx < 0 || ny < 0 || nx >= N || ny >= M) {
                    continue;
                }
                if(maps[nx][ny] == 0){
                    continue;
                }
                if(!visited[nx][ny]){
                    visited[nx][ny] = true;
                    deque.addLast(new Node(nx,ny));
                    output[nx][ny] = output[now.x][now.y]+1;
                }
            }
        }
        return output[N-1][M-1] == 0 ? -1 : output[N-1][M-1];
    }
}
