package 백준실버1;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class 미로탐색 {
    private static int[] dx = {0,0,1,-1};
    private static int[] dy = {1,-1,0,0};
    private static boolean[][] visited;
    private static ArrayDeque<Node> deque;
    private static int[][] map;
    private static int[][] answer;

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
        visited = new boolean[N][M];
        map = new int[N][M];
        answer = new int[N][M];

        for (int i = 0; i < N; i++) {
            String s = sc.next();
            for (int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(String.valueOf(s.charAt(j)));
            }
        }
        deque = new ArrayDeque<>();
        answer[0][0] = 1;
        visited[0][0] = true;
        bfs(new Node(0,0));

        System.out.println(answer[N-1][M-1]);
    }

    private static void bfs(Node node) {

        deque.addLast(new Node(node.x,node.y));

        while (!deque.isEmpty()){
            Node now = deque.pollFirst();
            for (int i = 0; i < 4; i++) {
                int nx = now.x + dx[i];
                int ny = now.y + dy[i];

                if(nx<0 || ny<0 || nx>=map.length || ny>=map[0].length || map[nx][ny] == 0){
                    continue;
                }
                if (!visited[nx][ny]){
                    visited[nx][ny] = true;
                    answer[nx][ny] = answer[now.x][now.y] + 1;
                    deque.addLast(new Node(nx,ny));
                }
            }
        }
    }
}
