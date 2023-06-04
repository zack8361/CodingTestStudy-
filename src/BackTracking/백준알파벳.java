package BackTracking;

import java.util.Arrays;
import java.util.Scanner;

public class 백준알파벳 {
    private static int[] dx ={0,0,1,-1};
    private static int[] dy = {1,-1,0,0};
    private static char[][] map;
    private static boolean[]visited;
    private static int max = -1;

    private static class Node{
        int x,y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //행
        int N = sc.nextInt();
        // 열
        int M = sc.nextInt();
        map = new char[N][M];

//        알파벳이 나오면 true 로 만들어줄 visited boolean
        visited = new boolean['Z' - 'A' + 1];

        // 입력 받아서 배열 만들기.
        for (int i = 0; i < map.length; i++) {
            String s = sc.next();
            for (int j = 0; j < map[i].length; j++) {
                map[i][j] = s.charAt(j);
            }
        }
        visited[map[0][0] - 'A'] = true;
        dfs(new Node(0,0),1);
        System.out.println(Arrays.toString(visited));
        System.out.println(max);
    }

    private static void dfs(Node now, int cnt) {
        max = Math.max(max,cnt);

        for (int i = 0; i < 4; i++) {
            int nx = now.x + dx[i];
            int ny = now.y + dy[i];

            if(nx <0 || ny<0 || nx>=map.length || ny>= map[0].length){
                continue;
            }

            if(!visited[map[nx][ny] - 'A']){
                visited[map[nx][ny] - 'A'] = true;
                dfs(new Node(nx,ny),cnt+1);
                visited[map[nx][ny] - 'A'] = false;
            }
         }
    }
}
