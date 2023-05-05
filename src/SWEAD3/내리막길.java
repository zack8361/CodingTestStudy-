package SWEAD3;

import java.util.Scanner;

public class 내리막길 {
    static private int cnt = 0;
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] map = new int[N][M];
        boolean[][] visited = new boolean[N][M];
        visited[0][0] = true;

        // 배열 입력.
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                map[i][j] = sc.nextInt();
            }
        }

    }

}
