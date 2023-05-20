package 백준실버2;

import java.util.ArrayDeque;
import java.util.Scanner;

public class 유기추배농 {
    private static int[] dx = {0,0,1,-1};
    private static int[] dy = {1,-1,0,0};

    private static class Node{
        int c,r;

        public Node(int c, int r) {
            this.c = c;
            this.r = r;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int tc = 0; tc<T; tc++) {
            int N = sc.nextInt(); // 가로
            int M = sc.nextInt(); // 세로
            int K  = sc.nextInt();
            int[][] map = new int[N][M];
            for(int i=0; i<K; i++){
                int x = sc.nextInt();
                int y = sc.nextInt();
                map[x][y] = 1;
            }
            int count = 0;
            boolean[][] visited = new boolean[N][M];
            ArrayDeque<Node> deque = new ArrayDeque<>();
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    if(map[i][j] == 1 && !visited[i][j]){
                        count++;
                        deque.add(new Node(i,j));
                        visited[i][j] = true;
                        while (!deque.isEmpty()){
                            Node now = deque.pollFirst();
                            for(int k=0; k<4; k++){
                                int nx = now.c + dx[k];
                                int ny = now.r + dy[k];
                                if(nx<0 || ny<0 || nx>=N || ny>=M){
                                    continue;
                                }
                                if(!visited[nx][ny] && map[nx][ny] == 1){
                                    visited[nx][ny] = true;
                                    deque.addLast(new Node(nx,ny));
                                }
                            }
                        }
                    }
                }
            }
            System.out.println(count);
        }
    }
}
