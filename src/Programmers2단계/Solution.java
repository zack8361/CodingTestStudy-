package Programmers2단계;

import java.util.ArrayDeque;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[][] maps = {{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,1},{0,0,0,0,1}};
        System.out.println(solution(maps));
    }

    private static final int[] dx = {0,0,1,-1};
    private static final int[] dy = {1,-1,0,0};
    private static class Node{
        int x,y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    public static int solution(int[][] maps) {
        int N = maps.length;
        int M = maps[0].length;

        // 갔는곳 체크 할 boolean 배열
        boolean[][] visited = new boolean[N][M];

        // maps, 와 visited 를 참조하여 실질적으로 값을 늘려줄 배열.
        int[][] answer = new int[N][M];
        ArrayDeque<Node> deque = new ArrayDeque<>();
        deque.addLast(new Node(0,0)); // 시작점 인것같다.
        answer[0][0] = 1;
        while(!deque.isEmpty()){
            Node now = deque.pollFirst(); // 들어가있는것 꺼낸다.
            for(int i=0; i<4; i++){
                int nx = now.x + dx[i];
                int ny = now.y + dy[i];

                if(nx<0 || ny < 0 || nx>= N || ny>=M){
                    continue;
                }
                if(maps[nx][ny] == 0) {
                    continue;
                }
                if(!visited[nx][ny]) {
                    visited[nx][ny] = true;
                    deque.addLast(new Node(nx,ny));
                    answer[nx][ny] = answer[now.x][now.y] + 1;
                }
            }
        }

        return answer[N-1][M-1] == 0 ? -1 : answer[N-1][M-1];
    }
}
