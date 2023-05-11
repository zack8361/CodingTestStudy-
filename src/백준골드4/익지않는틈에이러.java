package 백준골드4;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class 익지않는틈에이러 {

    private static int[]dx = {0,0,1,-1};
    private static int[]dy = {1,-1,0,0};


    private static class Node {
        int x,y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] map = new int[M][N];
        int[][] tomato = new int[M][N];
        boolean[][] visited = new boolean[M][N];


        for(int i=0; i<M; i++) {
            for (int j = 0; j < N; j++) {
                map[i][j] = sc.nextInt();
            }
        }

        ArrayDeque<Node> deque = new ArrayDeque<>();

        for(int i=0; i<M; i++){
            for(int j=0; j<N; j++){
                if(map[i][j] == 1){
                    tomato[i][j] = 1;
                    deque.addLast(new Node(i,j));
                    while (!deque.isEmpty()){
                        Node now = deque.pollFirst();
                        visited[now.x][now.y] = true;
                        for(int k=0; k<4; k++){
                            int nx = now.x + dx[k];
                            int ny = now.y + dy[k];
                            if(nx<0 || ny<0 || nx>=M || ny>=N){
                                continue;
                            }
                            if(!visited[nx][ny] && map[nx][ny] != -1){
                                visited[nx][ny] = true;
                                tomato[nx][ny] = tomato[now.x][now.y] + 1;
                                deque.addLast(new Node(nx,ny));
                            }
                        }
                    }
                }
            }
        }


    }
}
