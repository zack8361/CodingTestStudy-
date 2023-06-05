package 백준실버1;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class 단지번호붙이기 {
    private static class Node{
        int x,y;
        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    private static ArrayDeque<Node> deque;
    private static int[] dx = {0,0,1,-1};
    private static int[] dy = {1,-1,0,0};
    private static boolean[][] visited;
    private static int[][] map;
    private static ArrayList<Integer> list;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        map = new int[N][N]; // 7 * 7 짜리 배열 생성
        visited = new boolean[N][N];
        deque = new ArrayDeque<>();

        for (int i = 0; i < map.length; i++) {
            String s = sc.next();
            for (int j = 0; j < map.length; j++) {
                map[i][j] = Integer.parseInt(String.valueOf(s.charAt(j)));
            }
        }


        list = new ArrayList<>();
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {
                if(!visited[i][j] && map[i][j] == 1){
                    int count = 1;
                    bfs(new Node(i,j),count);
                }
            }
        }

        Collections.sort(list);
        System.out.println(list.size());
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    private static void bfs(Node node, int count) {
        deque.addLast(new Node(node.x,node.y));
        while (!deque.isEmpty()){
            Node now = deque.pollFirst();

            for (int i = 0; i < 4; i++) {
                int nx = now.x + dx[i];
                int ny = now.y + dy[i];

                if(nx<0 || ny<0 || nx>=map.length || ny>=map.length || map[nx][ny] == 0){
                    continue;
                }

                if (!visited[nx][ny]){
                    System.out.println("sex");
                    visited[nx][ny] = true;
                    deque.addLast(new Node(nx,ny));
                }
            }
        }
        System.out.println("---------------------");
        list.add(count);
    }
}
