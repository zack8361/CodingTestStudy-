package DFSBFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.StringTokenizer;

public class dfsEX01 {
    private static int[] dx = {0,0,1,-1};
    private static int[] dy = {1,-1,0,0};
    public static void main(String[] args) throws IOException {
        int[][] maps = {{1,0,1,1,1,1},{1,0,1,0,1,0},{1,0,1,0,1,1},{1,1,1,0,1,1}};
        System.out.println(solution(maps));
    }
    private static class Node{
        int x,y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    private static int solution(int[][] maps) {
        int N = maps.length; // 행의 개수
        int M = maps[0].length; // 열의 개수
        boolean[][] visited = new boolean[N][M]; //방문 체크용. -> 지나온길 다시 못가게 하기위해서.
        int[][] answer = new int[N][M]; // 실질적인 값 변경이 이루어지는 배열.

        answer[0][0] = 1;
        ArrayDeque<Node> deque = new ArrayDeque<>();
        deque.addLast(new Node(0,0)); // 시작값.
        while (!deque.isEmpty()){
            Node now = deque.pollFirst();
            for(int i=0; i<4; i++){
                int nx = now.x + dx[i];
                int ny = now.y + dy[i];
                if(nx<0 || ny <0 || nx>= maps.length || ny >=maps[0].length || maps[nx][ny] == 0){
                    continue;
                }
                if(!visited[nx][ny]){
                    visited[nx][ny] = true;
                    deque.addLast(new Node(nx,ny));
                    answer[nx][ny] = answer[now.x][now.y] + 1;
                }
            }
        }

        return 0;
    }
}
