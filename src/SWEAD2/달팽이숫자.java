package SWEAD2;

import java.util.Arrays;
import java.util.Scanner;

public class 달팽이숫자 {
    private static int[] dx = {0,1,0,-1};
    private static int[] dy = {1,0,-1,0};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int a=1; a<=N; a++){
            int M = sc.nextInt();
            int[][] map = new int[M][M]; //3 * 3 짜리 맵
            boolean[][] visited = new boolean[M][M];
            int x = 0;
            int y = 0;
            int dir = 0;

            for(int i=1; i<=M*M; i++){
                map[x][y] = i;
                visited[x][y] = true;
                int nx = x + dx[dir];
                int ny = y + dy[dir];
                if(nx<0 || ny<0 || nx>=M || ny>=M || visited[nx][ny]){
                    dir = (dir +1) % 4;
                }
                x = x + dx[dir];
                y = y + dy[dir];
            }
            System.out.println("#"+a);
            for(int i=0; i<M; i++){
                for(int j=0; j<M; j++){
                    System.out.print(map[i][j] +" ");
                }
                System.out.println();
            }
        }
    }
}
