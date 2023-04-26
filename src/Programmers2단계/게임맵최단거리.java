package Programmers2단계;

// 동 서 남 북 방향으로 한칸씩 이동하며, 게임 맵을 벗어난 길은 갈수 없다.

import java.util.ArrayDeque;
import java.util.Arrays;

class 게임맵최단거리 {

    public static void main(String[] args) {
        int[][] maps = {{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,1},{0,0,0,0,1}};
        System.out.println(solution(maps));
    }

    private static final int[] rx = {0,0,1,-1}; // 좌우.
    private static final int[] ry = {1,-1,0,0}; //상하

    private static class Node {
        int r,c;
        public Node(int r, int c) {
            this.r = r;
            this.c = c;
        }
    }

     public static int solution(int[][] maps) {
        int N = maps.length;
        int M = maps[0].length;
        boolean[][] visited = new boolean[N][M]; // 방문 확인용.
         int[][] dist = new int[N][M];
         ArrayDeque<Node> queue = new ArrayDeque<>();
         visited[0][0] = true;
         dist[0][0] = 1;
         queue.addLast(new Node(0,0));

         while (!queue.isEmpty()){

             Node now = queue.pollFirst(); // 현재 정점 꺼낸다
             for(int i=0; i<4; i++){
                 int nr = now.r + rx[i]; // 상하 탐색
                 int nc = now.c + ry[i]; // 좌우 탐색

                 if(nr<0 || nc < 0 || nr>=M || nc >=N){
                     continue;
                 }
                 if(maps[nr][nc] == 0){
                     continue;
                 }
                 if(!visited[nr][nc]){
                     visited[nr][nc] = true;
                     queue.addLast(new Node(nr,nc));
                     dist[nr][nc] = dist[now.r][now.c] + 1;
                 }
             }
         }

         for(int i=0; i<N; i++){
             System.out.println(Arrays.toString(maps[i]));
         }

        return dist[N-1][M-1] == 0 ? -1 : dist[N-1][M-1];
     }
 }
