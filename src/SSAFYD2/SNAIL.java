package SSAFYD2;

import java.util.ArrayDeque;
import java.util.Arrays;

public class SNAIL {
    private static final int[] dx = {0,1,0,-1};
    private static final int[] dy = {1,0,-1,0};

    public static void main(String[] args) {
        int n = 3;
        System.out.println(solution(n));
    }
    private static int solution(int n) {
        int[][]map = new int[n][n];
        boolean[][] visited = new boolean[n][n];
        int x = 0;
        int y = 0;
        int dir = 0;

        for(int i=1; i<=n*n; i++){
            map[x][y] = i;
            visited[x][y]  = true;
            // 지금 현재 위치결정.
            int nx = x + dx[dir];
            int ny = y + dy[dir];
            if(nx<0 || ny <0 || nx>=n || ny >= n || visited[nx][ny]){
                dir = (dir+1)%4;
            }
            x = x + dx[dir];
            y = y + dy[dir];
        }

        for(int i=0; i<n; i++){
            System.out.println(Arrays.toString(map[i]));
        }
        return 0;
    }
}
