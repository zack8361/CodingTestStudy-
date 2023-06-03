package BackTracking;

import java.util.Arrays;
import java.util.Scanner;

public class 알파벳 {

    private static boolean[] visited;
    private static int[]dx = {0,0,1,-1};
    private static int[]dy = {1,-1,0,0};
    private static int answer;
    private static char[][] map;
    private static class Node{
        int x;
        int y;
        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        map = new char[N][M];
        answer = 0;

        for (int i = 0; i < map.length; i++) {
            String s = sc.next();
            for (int j = 0; j < s.length(); j++) {
                map[i][j] = s.charAt(j);
            }
        }
        // 대문자 알파벳의 갯수 만큼 boolean 을 만들어준다.
        visited = new boolean['Z' - 'A' + 1];
        char a = 'B';
        visited[a-'A'] = true;

        System.out.println(Arrays.toString(visited));
    }
}
