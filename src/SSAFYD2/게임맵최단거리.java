package SSAFYD2;

import java.util.ArrayDeque;
import java.util.Arrays;

public class 게임맵최단거리 {
    // 상하 좌우 다갈수있는 거리
    private static int[]dx = {0,0,1,-1};
    private static int[]dy = {1,-1,0,0};
    public static void main(String[] args) {
        int[][] maps = {{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,1},{0,0,0,0,1}};
        System.out.println(solution(maps));
    }

    private static class Node {
        int x,y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    private static int solution(int[][] maps) {
        boolean[][] visited = new boolean[maps.length][maps[0].length];
        int[][] answer = new int[maps.length][maps[0].length];
        ArrayDeque<Node> deque = new ArrayDeque<>();
        deque.addLast(new Node(0,0)); // 시작점을 노드에 먼저 넣어둔다.
        answer[0][0] = 1;
        while (!deque.isEmpty()){ // queue가 비어있지 않을때 실행.
            Node now = deque.pollFirst();
            for(int i=0; i<4; i++){
                int nx = now.x + dx[i]; // i만큼 이동한 x의 값.
                int ny = now.y + dy[i]; // i만큼 이동한 y의 값.

                if(nx<0 || ny<0 || nx>= maps.length || ny>=maps.length||maps[nx][ny] == 0){
                    continue;
                }
                if(!visited[nx][ny]){
                    visited[nx][ny] = true;
                    deque.addLast(new Node(nx,ny));
                    answer[nx][ny] = answer[now.x][now.y] +1;
                }
            }
        }
        return answer[maps.length-1][maps[0].length-1] == 0 ? -1 : answer[maps.length-1][maps[0].length-1];

    }
}
