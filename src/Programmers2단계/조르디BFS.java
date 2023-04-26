package Programmers2단계;

import java.util.ArrayDeque;

public class 조르디BFS {

    private static final int[] rx = {0,0,1,-1}; // 상 하 /
    private static final int[] ry = {1,-1,0,0}; // 좌 우 /
    private static class Node{ // class 하나 생성
        int r, c; //Row Column
        public Node(int r, int c) { //생성자 생성.
            this.r = r;
            this.c = c;
        }
    }
    public static void main(String[] args) {
        int N = 5;
        int M = 5;
        int[][] map = {{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,1},{0,0,0,0,1}};
        ArrayDeque<Node> queue = new ArrayDeque<>(); // 방문할 큐를 하나 만들어줘야한다.
        boolean[][] visited = new boolean[N][M]; // map 배열이랑 동일한 사이즈를 만들어주면된다.
        int[][] dist = new int[N][M]; // 최단 거리 배열
        queue.addLast(new Node(0,0));
        int count = 1;
        visited[0][0] = true;
        dist[0][0] = 1;
        while (!queue.isEmpty()){
            Node now = queue.pollFirst(); // 현재 정점 꺼낸다.
            for(int i=0; i<4; i++){ // 상하 좌우 탐색 가능. 4가지 방향으로 다할수 있게 되었다.
                int nr = now.r + rx[i]; // 상하 탐색
                int nc = now.c + ry[i]; // 좌우 탐색

                if(nr < 0 || nc <0 || nc >= N || nr >= M){ // 맵 밖으로 나가는 경우 예외처리.
                    continue;
                }
                if(map[nr][nc] == 0) { // 갈수 없는 곳 (벽);
                    continue;
                }
                if(!visited[nr][nc]){
                    visited[nr][nc] = true;
                    queue.addLast(new Node(nr,nc));
                    dist[nr][nc] = dist[now.r][now.c] + 1;
                    count++;
                }
            }
        }

    }
}
