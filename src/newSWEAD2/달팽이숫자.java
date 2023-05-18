package newSWEAD2;

import java.util.Scanner;

public class 달팽이숫자 {
    private static int[] dx = {0,1,0,-1};
    private static int[] dy = {1,0,-1,0};
    private static boolean[][] visited;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int tc = 1; tc<=t; tc++){
            int N = sc.nextInt();
            visited = new boolean[N][N];
            int[][] arr = new int[N][N];
            int x = 0;
            int y = 0;
            int dir = 0;

            for(int i=1; i<=N*N; i++){
                arr[x][y] = i;
                visited[x][y] = true;
                int nx = x + dx[dir];
                int ny = y + dy[dir];
                if(nx<0 || ny<0 || nx>=arr.length || ny>= arr.length || visited[nx][ny]){
                    dir = (dir+1)%4;
                }
                x = x + dx[dir];
                y = y + dy[dir];
            }

            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    System.out.print(arr[i][j] +" ");
                }
                System.out.println();
            }

        }
    }
}
